package com.example.demo.contoller;


 
import com.example.demo.model.*;
 
import com.example.demo.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin(origins = "*")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/search")
    public List<Flight> searchFlights(@RequestParam String from, @RequestParam String to, @RequestParam String date) {
        System.out.println("Fetching flights from " + from + " to " + to + " on " + date);
        
        List<Flight> flights = flightService.getFlights(from, to, date);

        if (flights == null) {
            System.out.println("Error: Flights returned as null!");
            return Collections.emptyList();  // Prevent NullPointerException
        }

        System.out.println("Flights found: " + flights.size());
        return flights;
    }


}
