package com.example.accountservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @PostMapping(value = "/account/activity")
    public String createAccountActivity() {
        return "Hello Account";
    }
}
