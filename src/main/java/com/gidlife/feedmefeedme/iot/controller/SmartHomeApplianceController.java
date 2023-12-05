package com.gidlife.feedmefeedme.iot.controller;

import com.gidlife.feedmefeedme.iot.model.SmartApplianceData;
import com.gidlife.feedmefeedme.iot.service.SmartHomeApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/iot/smart-appliance")
public class SmartHomeApplianceController {

    private final SmartHomeApplianceService smartHomeApplianceService;

    @Autowired
    public SmartHomeApplianceController(SmartHomeApplianceService smartHomeApplianceService) {
        this.smartHomeApplianceService = smartHomeApplianceService;
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateSmartApplianceData(@RequestBody SmartApplianceData applianceData) {
        smartHomeApplianceService.processSmartApplianceData(applianceData);
        return ResponseEntity.ok("Smart appliance data updated successfully");
    }

    @GetMapping("/status")
    public ResponseEntity<String> getSmartApplianceStatus() {
        // Add logic to retrieve and return the status of smart appliances
        return ResponseEntity.ok("Smart appliance status retrieved successfully");
    }
}
