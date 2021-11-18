package com.company;

public class Planet {
    private int distanceToSun;
    private int mass;
    private int diameter;

    public Planet ( int distanceToSun, int mass, int diameter ){
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this. diameter = diameter;
    }

    public int getDistanceToSun() {
        return distanceToSun;
    }
    public int getMass() { return mass; }
    public int getDiameter() {
        return diameter;
    }

    public void setDistanceToSun(int distanceToSun) { this.distanceToSun = distanceToSun; }
    public void setMass(int mass) { this.mass = mass; }
    public void setDiameter(int diameter) { this.diameter = diameter; }
}
