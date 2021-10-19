package com;

import java.util.Scanner;

//для задания 2, 3, дз1, дз2, z5
//
public class Main {
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

   /* public static void main(String[] args) {
        String[] Names = new String[]{"Саша", "Даша", "Маша", "Наташа"};
        String found = "имени нет в массиве";
        Scanner sc = new Scanner(System.in);
        System.out.println("введите имя:");
        String searchedValue = sc.next();
        for (String x : Names) {
            if (x.equals(searchedValue)) {
                found = "имя есть в массиве";
                break;
            }
        }
        System.out.println(found);
}
    }*/

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String determination = "";
        do{
            double a;
            double b;
            double c = 0;
            char op;
            System.out.print("введите a: ");
            a = sc.nextDouble();
            System.out.print("введите b: ");
            b = sc.nextDouble();
            System.out.print("выберите арифметическую операцию [+, -, *, /]: ");
            op = sc.next().charAt(0);
            switch(op) {
                case '+': c = a + b;
                    break;
                case '-': c = a - b;
                    break;
                case '*': c = a * b;
                    break;
                case '/': c = a / b;
                    break;
                *//*default:
                    ваповащпшоп*//*
            }

            System.out.print(a + " " + op + " " + b + " = " + c);
            System.out.print("\nхотите продолжить? [y/n]");
            determination = sc.next();
        }while(determination.equals("y"));
    }
}*/

/*interface Fruit{
    String getName();
    double getWeight();
    boolean isTasty();
}
class Orange implements Fruit{
    public String getName(){
        return ("Апельсин");
    };
    public double getWeight(){
        Scanner sc = new Scanner(System.in);
        Double Fruitweight = fruitWeight.nextDouble();
        return Fruitweight;
    }
    boolean isTasty(String );
}
class Banana implements Fruit{
    String getName();
    double getWeight();
    boolean isTasty();
}
class Apple implements Fruit{
    String getName();
    double getWeight();
    boolean isTasty();
}*/
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
    /*public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String determination = "";
            do {
                int a;
                double b;
                char op;
                double c = 0;
                System.out.print("выберите операцию [+, -, *, /, ^, !]: ");
                op = sc.next().charAt(0);
                System.out.print("введите a: ");
                a = sc.nextInt();
                System.out.print("введите b: ");
                b = sc.nextInt();
                switch (op) {
                    case '+':
                        c = MathUtils.addition(a, b);
                        break;
                    case '-':
                        c = MathUtils.subtraction(a, b);
                        break;
                    case '*':
                        c = MathUtils.multiplication(a, b);
                        break;
                    case '/':
                        c = MathUtils.division(a, b);
                        break;
                    case '^':
                        c = MathUtils.pow(a, b);
                        break;
                    case '!':
                        c = MathUtils.getFactorial(a);
                        break;
                }
                System.out.print(" = " + c);
                System.out.print("\nхотите продолжить? [y/n]");
                determination = sc.next();
            } while (!determination.equals("n"));
        }
    }*/


    //z6
    static class NetworkInfo {
        String ssid;
        String passwd;
        String securityType;

        public void showParameters() {
            System.out.println("имя: " + this.ssid);
            System.out.println("пароль: " + this.passwd);
            System.out.println("тип безопасности: " + this.securityType);
        }
    }

    public static NetworkInfo fill(String n, String p, String st) {
        NetworkInfo networkInfo = new NetworkInfo();
        networkInfo.ssid = n;
        networkInfo.passwd = p;
        networkInfo.securityType = st;
        return networkInfo;
    }

    public static void main(String[] args) {
        NetworkInfo ni = fill("user", "12345", "0");
        ni.showParameters();
    }
}





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
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите a: ");
        double a = sc.nextDouble();
        System.out.print("введите b: ");
        double b = sc.nextDouble();
        System.out.print("введите c: ");
        double c = sc.nextDouble();

        Dz2 d = new Dz2(a, b, c);

        System.out.println("объём: " + Dz2.getVolume(d) + "\nплощадь поверхности: " + Dz2.getSurface_area(d));
    }*/

        //dz3





