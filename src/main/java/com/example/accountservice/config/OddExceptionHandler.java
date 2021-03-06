package com.example.accountservice.config;

import com.example.accountservice.OddException;
import com.example.accountservice.model.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class OddExceptionHandler {

    @ExceptionHandler({ OddException.class })
    public ResponseEntity<ErrorResponse> handleOddException(final Exception e, final WebRequest request) {
        ErrorResponse errorStatus = new ErrorResponse();
        errorStatus.setCode("9999999");
        errorStatus.setMessage("Odd Exception");

        return ResponseEntity.status(400).body(errorStatus);
    }
}
