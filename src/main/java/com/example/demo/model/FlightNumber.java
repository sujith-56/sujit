package com.example.demo.model;
 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // Ignores unknown fields
public class FlightNumber {
    private String number;
    private String iata; // Add this field

    // Getters and Setters
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getIata() { return iata; }
    public void setIata(String iata) { this.iata = iata; }
}
