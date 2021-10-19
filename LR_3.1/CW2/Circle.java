package com.company;

public class Circle implements Figure {
    public String getFigureName(){
        return "circle";
    }

    public double getPerimeter(Params p){
        return 2 * Math.PI * p.getR();
    }

    public double getSquare(Params p){
        return Math.PI * p.getR() * p.getR();
    }

    public void show(Params p){
        System.out.println("Figure: " + getFigureName() +
                "\nPerimeter: " + getPerimeter(p) +
                "\nSquare: " + getSquare(p));
    }
}
