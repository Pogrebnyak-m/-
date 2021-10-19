package com;

public class MathUtils {
    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static int division (int a, int b){
        return a / b;
    }
    public static int pow(int a, int b){
        return (int) Math.pow(a, b);
    }


    public static double addition(double a, double b){
        return a + b;
    }
    public static double subtraction(double a, double b){
        return a - b;
    }
    public static double multiplication(double a, double b){
        return a * b;
    }
    public static double division (double a, double b){
        return a / b;
    }
    public static double pow(double a, double b){
        return Math.pow(a, b);
    }


    public static double addition(double a, int b){
        return a + b;
    }
    public static double subtraction(double a, int b){
        return a - b;
    }
    public static double multiplication(double a, int b){
        return a * b;
    }
    public static double division (double a, int b){
        return a / b;
    }
    public static double pow(double a, int b){
        return Math.pow(a, b);
    }


    public static double addition(int a, double b){
        return a + b;
    }
    public static double subtraction(int a, double b){
        return a - b;
    }
    public static double multiplication(int a, double b){
        return a * b;
    }
    public static double division (int a, double b){
        return a / b;
    }
    public static double pow(int a, double b){
        return Math.pow(a, b);
    }


    public static int getFactorial(int a) {
        if (a <= 1) {
            return 1;
        }else {
            return a * getFactorial(a - 1);
        }
    }
}
