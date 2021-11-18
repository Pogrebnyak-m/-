package com.company;

public class Planet {
    private double distanceToSun;
    private double mass;
    private int diameter;

    public Planet ( double distanceToSun, double mass, int diameter ){
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this. diameter = diameter;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }
    public double getMass() { return mass; }
    public double getDiameter() {
        return diameter;
    }

    public void setDistanceToSun(double distanceToSun) { this.distanceToSun = distanceToSun; }
    public void setMass(double mass) { this.mass = mass; }
    public void setDiameter(int diameter) { this.diameter = diameter; }
}
