package com.example.backend.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/sleep")
public class SleepLogController {


    private static final Logger log = LoggerFactory.getLogger(SleepLogController.class);

    @GetMapping(path = "")
    public ResponseEntity<String> getSleep() {
        log.info("Get method called");
        return new ResponseEntity<>("sleep is not so good", HttpStatus.OK);
    }
}
