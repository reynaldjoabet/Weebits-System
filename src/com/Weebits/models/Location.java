package com.Weebits.models;

import java.util.HashMap;

public class Location {
    private  String name;
    private HashMap<Double,Double>coordinates;
    /**
     *
     */
    public Location(String name,double lon, double lat){
       coordinates.put(Double.valueOf(lon),Double.valueOf(lat));
       this.name=name;
    }

    public HashMap<Double, Double> getCoordinates() {
        return coordinates;
    }

    public String getName() {
        return name;
    }
}
