package com.example.demo.model;

public class Toilet {
    private String name;
    private Point p;

    public Toilet(String name, Point p) {
        this.name = name;
        this.p = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }
}
