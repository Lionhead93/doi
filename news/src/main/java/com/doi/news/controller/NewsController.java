package com.doi.news.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/news")
public class NewsController {

    @GetMapping("/ping")
    public String ping() {
        return "news service is up";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("news-request") String header) {
        log.info(header);
        return "gateway filter test";
    }

}
