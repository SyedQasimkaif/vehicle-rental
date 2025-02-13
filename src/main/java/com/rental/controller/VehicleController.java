//package com.rental.controller;
//
//import com.rental.entity.Vehicle;
//import com.rental.service.VehicleService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/vehicles")
//public class VehicleController {
//
//    private final VehicleService vehicleService;
//
//    public VehicleController(VehicleService vehicleService) {
//        this.vehicleService = vehicleService;
//    }
//
//    @GetMapping
//    public List<Vehicle> getAllVehicles() {
//        return vehicleService.getAllVehicles();
//    }
//
//    @GetMapping("/{id}")
//    public Vehicle getVehicleById(@PathVariable String id) {
//        return vehicleService.getVehicleById(id);
//    }
//
//    @PostMapping
//    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
//        return vehicleService.addVehicle(vehicle);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteVehicle(@PathVariable String id) {
//        vehicleService.deleteVehicle(id);
//    }
//}
