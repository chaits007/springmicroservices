package com.chaits.microservices.limitsservice.contoller;

import com.chaits.microservices.limitsservice.config.Configuration;
import com.chaits.microservices.limitsservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration config;

    @GetMapping("/limits")
    public LimitConfiguration getLimits() {
        return new LimitConfiguration(config.getMaximum(),config.getMinimum());
    }
}
