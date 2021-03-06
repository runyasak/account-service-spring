package com.example.accountservice.service;

import com.example.accountservice.model.Account;
import com.example.accountservice.model.Activity;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ActivityService {
    public List<Activity> getUserActivity(Account account) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/activity/" + account.getUser();
        ResponseEntity<List<Activity>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Activity>>() {});

        return response.getBody();
    }
}
