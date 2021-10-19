package com;

import java.util.Scanner;

public class Main {
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
    }
}





