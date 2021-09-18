package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    //задание1
   /* public static void main(String[] args) {
        String str = "1";
        int a = useInteger(str);
        double b = useDouble(str);
        double c = a + b;
        System.out.println(c);
    }
    public static int useInteger(String a1){
        return Integer.parseInt(a1);
    }

    public static double useDouble(String b1){
        return Double.parseDouble(b1);
    }*/

    //задание2
    //параллелепипед
    /*public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int h = 4;
        int v = getVolume(a, b, h);
        System.out.println(v);
    }
    public static int getVolume(int a, int b, int h){
        return a*b*h;
    }*/

    //шар
    /*public static void main(String[] args) {
        double r = 9.87;
        double v = getVolume(r);
        System.out.println (Math.round(v));
    }
    public static double getVolume(double r){
        return ((4*Math.PI*Math.pow(r, 3))/3);
    }*/

    //цилиндр
    /*public static void main(String[] args) {
        double r = 9.87;
        double h = 6;
        double v = getVolume(r, h);
        System.out.println (Math.round(v));
    }
    public static double getVolume(double r, double h){
        return (Math.PI*Math.pow(r, 2)*h);
    }*/

    //задание 3
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = Double.parseDouble("9.8");
        double x2 = Double.parseDouble("3");
        System.out.print("Введите a: ");
        double a = new Scanner(System.in).nextDouble();
        if ((a <= x1) && (a >= x2)) System.out.println("число принадлежит отрезку");
        else System.out.println("число не принадлежит отрезку");
    }*/

    //задание 4
    /*public static void main(String[] args) {
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
    }*/

    //задание 5 scanner+random
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int j = in.nextInt();
        int A[] = new int[j];
        int B[] = new int[j];
        System.out.println("Заполните первую матрицу:");
        for (int i = 0; i < j; i++) {
            A[i] = in.nextInt();
        }
        System.out.println("Заполните вторую матрицу");
        for (int k = 0; k < j; k++) {
            B[k] = in.nextInt();
        }
        for (int i = 0; i < j; i++)
            if (A[i] != B[i]) {
                System.out.println(i);
            }
    }*/

    /*public static void main(String[] args) {
        int[] A=new int[15];
        for (int i=0; i<A.length; i++)
            A[i]=new Random().nextInt(15);
        System.out.println(Arrays.toString(A));
        int[] B=new int[15];
        for (int i=0; i<B.length; i++)
            B[i]=new Random().nextInt(15);
        System.out.println(Arrays.toString(B));

        for (int i = 0; i < A.length; i++)
            if (A[i] != B[i]) {
                System.out.println(i);
            }
    }*/

    //задание 6 array+random
    /*public static void main(String[] args) {
        int[] A=new int[15];
        for (int i=0; i<A.length; i++)
            A[i]=new Random().nextInt(15);
        System.out.println(Arrays.toString(A));
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int[] B=Arrays.copyOfRange(A, 0,5);
        int[] C=Arrays.copyOfRange(A, 10,15);
        int[] resultArray=new int[B.length+C.length];
        int count = 0;
        for(int i = 0; i<B.length; i++) {
            resultArray[i] = B[i];
            count++;
        }
        for(int j = 0;j<C.length;j++) {
            resultArray[count++] = C[j];
        }
        for(int i = 0;i<resultArray.length;i++)
            System.out.print(resultArray[i]+" ");
    }*/

    //дз1 scaner
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String determination = "";
        do{
            double a;
            double b;
            double c = 0;
            char op;
            System.out.print("введите два числа: ");
            a = sc.nextDouble();
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
            }
            System.out.print(a + " " + op + " " + b + " = " + c);
            System.out.print("\nхотите продолжить? [y/n]");
            determination = sc.next();
        }while(!determination.equals("n"));
    }*/

    //дз2 scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Names =  new String[] { "Саша", "Даша", "Маша", "Наташа"};
        /*String[] name = { "Саша"};*/

        System.out.println("введите имя:");
        String name = sc.next();
        for (String s : Names) {
            if (s.equals(name)) {
                System.out.println("имя есть в массиве");;
            }
            else {
                System.out.println("имени нет в массиве");}
        }
    }
}
