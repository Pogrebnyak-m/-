package com.company;

public class Rectangle extends Quadrangle{
    public String getFigureName(){
        return "rectangle";
    }

    public double getPerimeter(Params p){
        return 2 * (p.getA() + p.getB());
    }

    public double getSquare(Params p){
        return p.getA() * p.getB();
    }

    public void show(Params p){
        System.out.println("Figure: " + getFigureName() +
                "\nPerimeter: " + getPerimeter(p) +
                "\nSquare: " + getSquare(p));
    }
}
