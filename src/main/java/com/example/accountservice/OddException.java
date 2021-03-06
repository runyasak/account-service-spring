package com.example.accountservice;

import com.example.accountservice.model.CommonException;
import com.example.accountservice.model.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class OddException extends Exception {

    @ExceptionHandler({ CommonException.class })
    public ResponseEntity<ErrorResponse>OddException(String s, String general_error) {
        ErrorResponse response = new ErrorResponse("500", "account-service", "Generic Error");
        return ResponseEntity.ok(response);
    }
}
