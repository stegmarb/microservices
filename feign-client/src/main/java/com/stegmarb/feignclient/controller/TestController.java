package com.stegmarb.feignclient.controller;

import com.stegmarb.feignclient.client.FragranceClient;
import com.stegmarb.feignclient.model.Fragrance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    FragranceClient fragranceClient;

    @GetMapping("/test/{name}")
    public String getFragranceFromAnotherService(@PathVariable String name) {
        Fragrance fragrance = fragranceClient.getFragrance(name);
        return fragrance.toString();
    }
}
