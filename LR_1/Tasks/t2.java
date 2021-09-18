package com.company;

public class t2 {
//параллелепипед
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int h = 4;
        int v = getVolume(a, b, h);
        System.out.println(v);
    }
    public static int getVolume(int a, int b, int h){
        return a*b*h;
    }

//шар
    /*public static void main(String[] args) {
        double r = 9.87;
        double v = getVolume(r);
        System.out.println (Math.round(v));
    }
    public static double getVolume(double r){
        return ((4*Math.PI*Math.pow(r, 3))/3);
    }*/

//цилиндр
    /*public static void main(String[] args) {
        double r = 9.87;
        double h = 6;
        double v = getVolume(r, h);
        System.out.println (Math.round(v));
    }
    public static double getVolume(double r, double h){
        return (Math.PI*Math.pow(r, 2)*h);
    }*/
}
