package com.Weebits.models;

import java.util.UUID;

public class Driver {
    private UUID driverId;
    private  String driverName;
    private  Location location;
    private  boolean available;
    /**
     *
     */
    public  Driver(String name, Location location){
        this.driverId= UUID.randomUUID();
        this.location=location;
        this.driverName=name;
        this.available=true;
    }

    public String getDriverName() {
        return driverName;
    }

    public Location getLocation() {
        return location;
    }

    public UUID getDriverId() {
        return driverId;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean getAvailability() {
        return available;
    }
}
