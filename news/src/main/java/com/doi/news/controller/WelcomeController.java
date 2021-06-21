package com.doi.news.controller;

import com.doi.news.config.ApplicationConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class WelcomeController {

    private final ApplicationConfiguration applicationConfiguration;

    @GetMapping("/message")
    public Map<String, String> welcome() {

        final Map<String, String> map = new HashMap<>();
        map.put("message", applicationConfiguration.getMessage());

        return map;
    }

}
