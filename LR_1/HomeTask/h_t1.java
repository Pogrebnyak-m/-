package com.company;
import java.util.Scanner;

public class h_t1 {
    public static void main(String[] args) {
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
    }
}
