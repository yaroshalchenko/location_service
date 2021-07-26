package com.example.demo.controller;


import com.example.demo.controller.dto.ShortestLocationDto;
import com.example.demo.model.Point;
import com.example.demo.model.PointDistance;
import com.example.demo.service.LocationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }


    @GetMapping
    public ShortestLocationDto getShortestLocation(double x, double y, String username){
        PointDistance pointDistance = locationService.findShortestDistance(new Point(x,y));

        String message =  "The shortest distance for " + username + "is " + pointDistance.getDistance();

        return ShortestLocationDto.fromPointDistanceAndMessage(pointDistance, message);
    }

}
