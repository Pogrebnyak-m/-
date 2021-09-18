package com.company;
import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        circle();
    }
    public static void circle() {
        Scanner sc = new Scanner(System.in);
        double x1 = 9.8;
        double x2 = 3;
        String determination;
        System.out.print("Введите a: ");
        double a = new Scanner(System.in).nextDouble();

        if ((a <= x1) && (a >= x2)) System.out.println("число принадлежит отрезку");
        else System.out.println("число не принадлежит отрезку");
        System.out.print("хотите продолжить? [y/n]");
        determination = sc.nextLine();
        if (determination.equals("y")) {
            circle();
        }
        else if(determination.equals("n")){return;}
        else System.out.print("СИМВОЛ ОТЛИЧЕН ОТ y/n");
    }
}
