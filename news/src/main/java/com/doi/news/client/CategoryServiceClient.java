package com.doi.news.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "category")
public interface CategoryServiceClient {

    @GetMapping("/category/{categoryId}")
    String getCategories(@PathVariable("categoryId") String categoryId);

}
