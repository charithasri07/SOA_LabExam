package com.example.driverservice.controller;

import com.example.driverservice.service.DriverService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping("/driver/message")
    public String getMessage() {
        return driverService.getMessage();
    }
}