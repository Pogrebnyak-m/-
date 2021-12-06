package com.company;

import java.util.Random;

public class Concatenator {
    private static final Object monitor = new Object();
    public static StringBuilder sb = new StringBuilder();

    public static void concatenateString() throws InterruptedException {
        synchronized (monitor) {
            Random r = new Random();
            for (int j = 0; j < 20000; j++) {
                int wordLength = (int) (Math.random() * 10 + 1);
                for (int i = 0; i < wordLength; i++) {
                    char tmp = (char) ('a' + r.nextInt('z' - 'a'));
                    sb.append(tmp);
                }
                sb.append(" ");
            }
            monitor.wait();
        }
    }
    public static void showLength(){
        synchronized (monitor) {
            System.out.print(sb);
            monitor.notify();
        }
    }
}
