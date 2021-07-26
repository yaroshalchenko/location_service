package com.example.demo.model;

public class PointDistance {
    private Point point;
    private double distance;

    public PointDistance(Point point, double distance) {
        this.point = point;
        this.distance = distance;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
