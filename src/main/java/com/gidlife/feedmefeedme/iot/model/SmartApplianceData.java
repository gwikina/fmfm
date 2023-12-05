package com.gidlife.feedmefeedme.iot.model;

public class SmartApplianceData {

    private String applianceId;
    private boolean isOn;

    // Other smart appliance-related fields

    // Constructors, getters, and setters

    public SmartApplianceData() {
        // Default constructor
    }

    public SmartApplianceData(String applianceId, boolean isOn) {
        this.applianceId = applianceId;
        this.isOn = isOn;
        // Initialize other fields as needed
    }

    public String getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(String applianceId) {
        this.applianceId = applianceId;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    // Add other getters and setters for additional fields
}
