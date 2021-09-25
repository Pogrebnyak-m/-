package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        double a = sc.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = sc.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = sc.nextDouble();

        Roots roots = Roots.getRoots(a, b, c);

        if (roots.number_of_roots == 1) {
            System.out.println("Уравнение имеет единственный корень: x = " + roots.x1);
            } else if (roots.number_of_roots == 2) {
                System.out.println("Корни уравнения: x1 = " + roots.x1 + ", x2 = " + roots.x2);
            } else if (roots.number_of_roots == 0){
                System.out.println("Уравнение не имеет действительных корней");
            }
        }
}
