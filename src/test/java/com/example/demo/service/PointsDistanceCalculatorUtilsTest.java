package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointsDistanceCalculatorUtilsTest {

    @Test
    public void calculateDistanceBetweenPoints() {
        double x1 = 3;
        double y1 = 4;
        double x2 = 7;
        double y2 = 1;

        double distance = PointsDistanceCalculatorUtils.calculateDistanceBetweenPoints(x1, y1, x2, y2);

        assertEquals(distance, 5, 0.001);
    }
}
