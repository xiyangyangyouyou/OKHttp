package com.example.demo.controller;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OkHttpController {

    private static Logger logger = LoggerFactory.getLogger(OkHttpController.class);

    Gson gson = new Gson();

    @GetMapping
    public String hello() {
        logger.debug(gson.toJson("132132"));
        return "hello";
    }

}
