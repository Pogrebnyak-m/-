package com.company;
//для задания 2
import java.util.Scanner;

public class Main {
    //z1
    /*public static void main(String[] args) {
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
    }*/

    //z2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        double a = sc.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = sc.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = sc.nextDouble();

        Roots roots = getRoots(a, b, c);

        public static Roots getRoots(double a, double b, double c) {
            Roots roots = new Roots();
            double d = Math.pow(b, 2) - 4 * a * c;
            if (d > 0) {
                roots.getNumber_of_roots(2);
                System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            } else if (d == 0) {
                roots.getNumber_of_roots(int 1);
                System.out.println("Уравнение имеет единственный корень: x = " + x);
            } else {
                roots.getNumber_of_roots(0);
                System.out.println("Уравнение не имеет действительных корней");
            }
        }
    }


}
