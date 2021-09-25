package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите a: ");
        double a = sc.nextDouble();
        System.out.print("введите b: ");
        double b = sc.nextDouble();
        System.out.print("введите c: ");
        double c = sc.nextDouble();

        Dz2 d = new Dz2(a, b, c);

        System.out.println("объём: " + Dz2.getVolume(d) + "\nплощадь поверхности: " + Dz2.getSurface_area(d));
    }

}
