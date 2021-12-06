package com.company;

import java.math.BigInteger;

public class MyThread extends Thread {
    int number = 0;

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 3000000; i <= 6000000; i++) {
            boolean result;
            BigInteger bInt = BigInteger.valueOf(i);
            result = bInt.isProbablePrime((int) Math.log(i));
            if (result) {
                number++;
            }
        }

        long timeSpent = System.currentTimeMillis() - startTime;

        System.out.println("\tКоличество простых чисел: " + number);
        System.out.println("\tВремя работы программы: " + timeSpent + " [мс]");
    }
}
