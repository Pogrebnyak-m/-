package com.company;

public class Square extends Quadrangle{
    public String getFigureName(){
        return "square";
    }

    public double getPerimeter(Params p){
        return 4 * p.getA();
    }

    public double getSquare(Params p){
        return p.getA() * p.getA();
    }

    public void show(Params p){
        System.out.println("Figure: " + getFigureName() +
                "\nPerimeter: " + getPerimeter(p) +
                "\nSquare: " + getSquare(p));
    }
}
