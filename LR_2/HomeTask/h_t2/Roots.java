package com.company;

public class Roots {
    public double x1;
    public double x2;
    public double number_of_roots;

    static Roots getRoots(double a, double b, double c){
        Roots roots = new Roots();
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d == 0){
            roots.x1 = roots.x2 = -b/(2*a);
            roots.number_of_roots = 1;
        } else if (d > 0){
            roots.x1 = (-b + Math.sqrt(d))/(2*a);
            roots.x2 = (-b - Math.sqrt(d))/(2*a);
            roots.number_of_roots = 2;
        } else{
            roots.number_of_roots = 0;
        }
        return roots;
    }
}
