package com.rental.controller;
//
//import com.rental.entity.Location;
//import com.rental.service.LocationService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/locations")
//public class LocationController {
//
//    private final LocationService locationService;
//
//    public LocationController(LocationService locationService) {
//        this.locationService = locationService;
//    }
//
//    @GetMapping
//    public List<Location> getAllLocations() {
//        return locationService.getAllLocations();
//    }
//
//    @PostMapping
//    public Location addLocation(@RequestBody Location location) {
//        return locationService.addLocation(location);
//    }
//}


import com.rental.entity.Location;
import com.rental.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    // Display all locations
    @GetMapping("/list")
    public String listLocations(Model model) {
        List<Location> locations = locationService.getAllLocations();
        model.addAttribute("locations", locations);
        return "location-list";
    }

    // Show form for creating a new location
    @GetMapping("/create")
    public String createLocationForm(Model model) {
        model.addAttribute("location", new Location());
        return "location-form";
    }

    // Save or update a location
    @PostMapping("/save")
    public String saveLocation(@ModelAttribute("location") Location location) {
        locationService.saveLocation(location);
        return "redirect:/location/list";
    }

    // Edit location
    @GetMapping("/edit/{id}")
    public String editLocation(@PathVariable("id") String id, Model model) {
        Optional<Location> location = locationService.getLocationById(id);
        if (location.isPresent()) {
            model.addAttribute("location", location.get());
            return "location-form";
        } else {
            return "error";  // Add a user-friendly error page
        }
    }

    // Delete location
    @GetMapping("/delete/{id}")
    public String deleteLocation(@PathVariable("id") String id) {
        locationService.deleteLocationById(id);
        return "redirect:/location/list";
    }
}


