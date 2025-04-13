package com.example.demo.model;

 

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // Ignores unknown fields
public class AirportInfo {
    private String iataCode;
    private String name;
    private String country;
    private String city;
    private String airport;
    private String Schedule;// Add this field

    // Getters and Setters
    public String getIataCode() { return iataCode; }
    public void setIataCode(String iataCode) { this.iataCode = iataCode; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getAirport() { return airport; }
    public void setAirport(String airport) { this.airport = airport; }
	public String getScheduled() {
		 
		return Schedule; 
	}
	public void setSecheduled(String Schedule) {
		this.Schedule=Schedule;
	}
}
