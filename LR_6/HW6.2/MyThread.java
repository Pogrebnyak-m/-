package com.company;

import java.math.BigInteger;

public class MyThread extends Thread {
    int number = 0;
    int a;
    int b;
    int c = 3000000;

    public MyThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        c = c + a * (b + 1);
        long startTime = System.currentTimeMillis();
        for (int i = (3000000 + a * b); i <= c; i++) {
            boolean result;
            BigInteger bInt = BigInteger.valueOf(i);
            result = bInt.isProbablePrime((int) Math.log(i));
            if (result) {
                number++;
            }
        }

        long timeSpent = (System.currentTimeMillis() - startTime);

        System.out.println("\n\tКоличество простых чисел в интервале от " + (3000000 + a * b) + " до " + c
                + " : " + number);
        System.out.println("\tВремя работы программы: " + timeSpent + " [мс]");

    }
}

