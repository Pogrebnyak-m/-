package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b = (-1);

        Scanner sc = new Scanner(System.in);
        System.out.print("Задайте количество потоков [2; 10] : ");
        String nText = sc.nextLine();
        int n = Integer.parseInt(nText);

        long startTime = System.currentTimeMillis();
        Thread[] c = new Thread[n];
        for (int i = 0; i < n; i++) {
            int a = (3000000 / n);
            b = b + 1;
            c[i] = new MyThread(a, b);
            c[i].start();
        }

        for (int i = 0; i < n; i++) {
            try {
                c[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long timeSpent = (System.currentTimeMillis() - startTime);

        System.out.println();
        System.out.println("Общее время работы программы: " + timeSpent + " [мс]");
    }
}
