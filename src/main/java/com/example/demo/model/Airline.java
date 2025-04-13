package com.example.demo.model;

 

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // Ignores unknown fields
public class Airline {
    private String name;
    private String iata; // Add this field
    
    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIata() { return iata; } 
    public void setIata(String iata) { this.iata = iata; }
}
