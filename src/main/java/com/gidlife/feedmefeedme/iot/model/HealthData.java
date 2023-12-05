package com.gidlife.feedmefeedme.iot.model;

public class HealthData {

    private int heartRate;
    private int bloodPressure;

    // Other health-related fields

    // Constructors, getters, and setters

    public HealthData() {
        // Default constructor
    }

    public HealthData(int heartRate, int bloodPressure) {
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        // Initialize other fields as needed
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

}
