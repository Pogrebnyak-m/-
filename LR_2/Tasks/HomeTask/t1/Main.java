package com.company;
//для задания 2, 3, дз1, дз2,
import java.util.Scanner;
//

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
   /* public static void main(String[] args) {
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
        }*/

    //z3
    /*public static void main(String[] args) {
        A aaa = new A();
        B bbb = new B();
        C ccc = new C();
        D ddd = new D();

        Scanner sc = new Scanner(System.in);
        System.out.print("введите a: ");
        int a = sc.nextInt();
        System.out.print("введите b: ");
        int b = sc.nextInt();

        aaa.count(a, b);
        aaa.show();

        bbb.count(a, b);
        bbb.show();

        ccc.count(a, b);
        ccc.show();

        ddd.count(a, b);
        ddd.show();

    }*/

    //z4
    /*public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.surface_area(4, 5);
        cylinder.volume(4, 5);

        cylinder.surface_area_str("3", "5");
        cylinder.volume_str("3", "5");

        cylinder.surface_area_d(2, 5);
        cylinder.volume_d(2, 5);
    }*/

    //z5





    //dz1
    /*public static void main(String[] args) {
        String determination;
        String model1;
        double maxSpeed1 = 0;
        String weight1;
        double weight2 = 0;
        Car car;

        do{
            Scanner sc = new Scanner(System.in);

            System.out.print("введите модель: ");
            String model = sc.nextLine();
            System.out.print("ввод максимальной скорости? [y/n]");
            model1 = sc.next();
            if ("y".equals(model1)){
                System.out.print("введите максимальную скорость: ");
                maxSpeed1 = sc.nextDouble();
            }
            System.out.print("ввод веса? [y/n]");
            weight1 = sc.next();
            if("y".equals(weight1)){
                System.out.print("введите вес: ");
                weight2 = sc.nextDouble();
            }
            if ("y".equals(model1) && "y".equals(weight1)){
                car = new Car(model, maxSpeed1, weight2);
            } else if ("y".equals(model1)){
                car = new Car(model, maxSpeed1);
            } else {
                car = new Car(model);
            }

            car.show();
            System.out.print("\nхотите продолжить? [y/n]");
            determination = sc.next();
        } while (!determination.equals("n"));
    }*/

    //dz2
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
