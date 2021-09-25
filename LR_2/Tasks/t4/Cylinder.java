package com.company;

public class Cylinder {

    public double surface_area(int r, int h){
        System.out.println("1. суммарная площадь поверхностей:  " + Math.round(2 * Math.PI * r * (r + h)));
        return 2 * Math.PI * r * (r + h);
    }
    public double volume(int r, int h){
        System.out.println("объём:  " + Math.round(Math.PI * Math.pow(r, 2) * h));
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double surface_area_str( String r1, String h1){
        double r =Double.parseDouble(r1);
        double h =Double.parseDouble(h1);
        System.out.println("2. суммарная площадь поверхностей:  " + Math.round(2 * Math.PI * r * (r + h)));
        return 2 * Math.PI * r * (r + h);
    }
    public double volume_str( String r1, String h1){
        double r =Double.parseDouble(r1);
        double h =Double.parseDouble(h1);
        System.out.println("объём:  " + Math.round(Math.PI * Math.pow(r, 2) * h));
        return Math.PI * Math.pow(r, 2) * h;
    }

    public double surface_area_d(double r, double h){
        System.out.println("3. суммарная площадь поверхностей:  " + Math.round(2 * Math.PI * r * (r + h)));
        return 2 * Math.PI * r * (r + h);
    }
    public double volume_d(double r, double h){
        System.out.println("объём:  " + Math.round(Math.PI * Math.pow(r, 2) * h));
        return Math.PI * Math.pow(r, 2) * h;
    }

}
