package com.example.demo.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {

    @JsonProperty("flight_date")
    private String flightDate;

    @JsonProperty("flight_status")
    private String flightStatus;

    @JsonProperty("flight")
    private FlightNumber flight;

    @JsonProperty("airline")
    private Airline airline;

    @JsonProperty("departure")
    private AirportInfo departure;

    @JsonProperty("arrival")
    private AirportInfo arrival;
    
    private FlightDetails departuree;
    private FlightDetails arrivall;
    private Departure departureee;
    private Arrival arrivalll;
    
    public Departure getDepartureee() {
		return departureee;
	}

	public void setDepartureee(Departure departureee) {
		this.departureee = departureee;
	}

	public Arrival getArrivalll() {
		return arrivalll;
	}

	public void setArrivalll(Arrival arrivalll) {
		this.arrivalll = arrivalll;
	}

	// Default constructor (required for JSON parsing)
    public Flight() {}

    // Getters and Setters
    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public FlightDetails getDeparturee() {
		return departuree;
	}

	public void setDeparturee(FlightDetails departuree) {
		this.departuree = departuree;
	}

	public FlightDetails getArrivall() {
		return arrivall;
	}

	public void setArrivall(FlightDetails arrivall) {
		this.arrivall = arrivall;
	}

	public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public FlightNumber getFlight() {
        return flight;
    }

    public void setFlight(FlightNumber flight) {
        this.flight = flight;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public AirportInfo getDeparture() {
        return departure;
    }

    public void setDeparture(AirportInfo departure) {
        this.departure = departure;
    }

    public AirportInfo getArrival() {
        return arrival;
    }

    public void setArrival(AirportInfo arrival) {
        this.arrival = arrival;
    }
}