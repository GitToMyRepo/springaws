package com.mywork.springaws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HealthController {

    Logger logger = LoggerFactory.getLogger(HealthController.class);
    
    @GetMapping("/api/health")
    public String healthCheck() {
    	logger.info("Entering healthCheck");
        return "OK";
    }
}
