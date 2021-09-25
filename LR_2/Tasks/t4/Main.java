package com.company;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.surface_area(4, 5);
        cylinder.volume(4, 5);

        cylinder.surface_area_str("3", "5");
        cylinder.volume_str("3", "5");

        cylinder.surface_area_d(2, 5);
        cylinder.volume_d(2, 5);
    }
}
