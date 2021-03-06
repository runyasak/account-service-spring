package com.example.accountservice.controller;

import com.example.accountservice.OddException;
import com.example.accountservice.model.Account;
import com.example.accountservice.model.Activity;
import com.example.accountservice.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    private final ActivityService activityService;

    public AccountController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping(value = "/account/activity")
    public ResponseEntity<List<Activity>> createAccountActivity(@RequestBody Account account) {
        try {
            List<Activity> activities = activityService.getUserActivity(account);
            return ResponseEntity.ok().body(activities);
        } catch (Exception e) {
            throw new OddException("9999999", "General Error");
        }
    }
}
