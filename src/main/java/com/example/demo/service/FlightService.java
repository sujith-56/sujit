package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

import com.example.demo.model.FlightResponse;
import com.example.demo.model.Flight;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Service
public class FlightService {
    private final String API_URL = "https://api.aviationstack.com/v1/flights?access_key=0591bf5f54fd0c30dab37347073c8f39";

    public List<Flight> getFlights(String from, String to, String date) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + "&dep_iata=" + from + "&arr_iata=" + to;

        try {
            // Log the API request URL
            System.out.println("API URL: " + url);

            // Fetch response as a String
            ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
            String jsonResponse = responseEntity.getBody();

            // Log the raw JSON response
            System.out.println("API Response: " + jsonResponse);

            // Convert JSON string to FlightResponse object
            ObjectMapper objectMapper = new ObjectMapper();
            FlightResponse response = objectMapper.readValue(jsonResponse, FlightResponse.class);

            if (response != null && response.getData() != null) {
                List<Flight> flightList = response.getData();

                // Print each flight's details
                for (Flight flight : flightList) {
                    System.out.println("✈ Flight Number: " + flight.getFlight().getNumber());
                    System.out.println("🛫 Departure: " + flight.getDeparture().getAirport() + 
                                       " at " + flight.getDeparture().getScheduled());
                    System.out.println("🛬 Arrival: " + flight.getArrival().getAirport() + 
                                       " at " + flight.getArrival().getScheduled());
                    System.out.println("-----------------------------------");
                }

                return flightList;
            } else {
                System.out.println("No flights found!");
                return List.of();  // Return an empty list
            }
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();  // Return an empty list in case of error
        }
    }
}
