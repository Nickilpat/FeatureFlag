package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/features")
public class FeatureFlagController {

    private boolean featureFlag;

    @CrossOrigin(allowedHeaders = "*")
    @GetMapping(value = "/isEnabled")
    public boolean isEnabled() {
        return featureFlag;
    }

    @PostMapping(value = "/setStatus")
    public void setStatus(boolean status) {
        this.featureFlag = status;
    }

    public boolean getFeatureFlag() {
        return featureFlag;
    }
}
