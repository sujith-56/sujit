package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightDetails {
    private String airport;
    private String iata;
    private String scheduled;

    // Getters and Setters
    public String getAirport() { return airport; }
    public void setAirport(String airport) { this.airport = airport; }

    public String getIata() { return iata; }
    public void setIata(String iata) { this.iata = iata; }

    public String getScheduled() { return scheduled; }
    public void setScheduled(String scheduled) { this.scheduled = scheduled; }
}
