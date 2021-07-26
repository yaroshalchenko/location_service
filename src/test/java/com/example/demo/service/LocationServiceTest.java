package com.example.demo.service;

import com.example.demo.model.Point;
import com.example.demo.model.PointDistance;
import com.example.demo.repository.MockedToiletRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationServiceTest {
    private LocationService locationService;

    @BeforeEach
    void setUp() {
        locationService = new LocationService(new MockedToiletRepository());
    }

    @Test
    void findShortestDistance() {
        Point expected = new Point(1, 5);
        PointDistance pointDistance = locationService.findShortestDistance(new Point(3, 4));

         Assertions.assertEquals(2.236,  pointDistance.getDistance(), 0.001);
         Assertions.assertEquals(expected,  pointDistance.getPoint());
    }
}
