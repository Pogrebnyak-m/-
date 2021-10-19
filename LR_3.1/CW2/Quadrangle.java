package com.company;

public abstract class Quadrangle implements Figure{
    public String getFigureName(){
        return "quadrangle";
    }

    public void show(Params p){
        System.out.println("Figure: " + getFigureName() +
                "\nPerimeter: " + getPerimeter(p) +
                "\nSquare: " + getSquare(p));
    }
}
