package com.company;

import java.util.Scanner;

public class Main {
   
        
    public static void main(String[] args) {
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

    }
}
