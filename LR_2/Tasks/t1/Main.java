package com.company;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(9, 3, 6);
        circle.print();
        circle.move();
        circle.distToOtherCircle();
        circle.changeRadius();
        circle.getPerimetr();
        circle.getSquare();
        System.out.println("Расстояние до другого круга: " + circle.distToOtherCircle());
        System.out.println("Периметр: " + Math.round(circle.getPerimetr()));
        System.out.println("Площадь: " + Math.round(circle.getSquare()));
    }
}
