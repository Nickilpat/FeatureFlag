package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/features")
public class FeatureFlagController {

    @GetMapping(value = "/isEnabled")
    public boolean isEnabled() {
        return false;
    }

}
