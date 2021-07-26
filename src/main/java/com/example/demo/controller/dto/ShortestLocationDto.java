package com.example.demo.controller.dto;

import com.example.demo.model.PointDistance;


public class ShortestLocationDto {
    private PointDistance pointDistance;
    private String message;

    public ShortestLocationDto(PointDistance pointDistance, String message) {
        this.pointDistance = pointDistance;
        this.message = message;
    }

    public static ShortestLocationDto fromPointDistanceAndMessage(PointDistance pointDistance, String message){
        return new ShortestLocationDto(pointDistance,message);
    }
}
