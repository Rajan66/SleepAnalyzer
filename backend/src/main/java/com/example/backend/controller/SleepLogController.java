package com.example.backend.controllers;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/api/sleep")
public class SleepLogController {

    public ResponseEntity<String> getSleepLog() {
        log.info("Get method called");
        return new ResponseEntity<>("sleep is not so good", HttpStatus.OK);
    }
}
