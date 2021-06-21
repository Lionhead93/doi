package com.doi.news.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "news")
public interface NewsServiceClient {

    @GetMapping("/message")
    String getMessage();

}
