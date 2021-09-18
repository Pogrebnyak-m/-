package com.company;
import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = Double.parseDouble("9.8");
        double x2 = Double.parseDouble("3");
        System.out.print("Введите a: ");
        double a = new Scanner(System.in).nextDouble();
        if ((a <= x1) && (a >= x2)) System.out.println("число принадлежит отрезку");
        else System.out.println("число не принадлежит отрезку");
    }
}
