package com.company;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Orange orange = new Orange();

        System.out.println("1. It is " + apple.isTasty() + " that the " + apple.getName() + " is tasty");
        System.out.println("2. A " + banana.getName() + " with a peel weighs " + banana.getWeight());
        System.out.println("3. -The " + orange.getName() + " is tasty!" +
        "\n   -It's " + orange.isTasty());

    }
}
