package com.gidlife.feedmefeedme.iot.controller;

import com.gidlife.feedmefeedme.iot.model.HealthData;
import com.gidlife.feedmefeedme.iot.service.HealthMonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/iot/health")
public class HealthMonitoringController {

    private final HealthMonitoringService healthMonitoringService;

    @Autowired
    public HealthMonitoringController(HealthMonitoringService healthMonitoringService) {
        this.healthMonitoringService = healthMonitoringService;
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateHealthData(@RequestBody HealthData healthData) {
        healthMonitoringService.processHealthData(healthData);
        return ResponseEntity.ok("Health data updated successfully");
    }

    @GetMapping("/summary")
    public ResponseEntity<String> getHealthSummary() {
        // Add logic to retrieve and return a summary of health data
        return ResponseEntity.ok("Health summary retrieved successfully");
    }

    // Other endpoints and methods for IoT functionalities
}
