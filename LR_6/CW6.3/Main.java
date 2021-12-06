package com.company;

public class Main {

    private static int counter;

    public static void main(String[] args) {
        Thread t1 = new IncrementerThread();
        t1.start();
        Thread t2 = new IncrementerThread();
        t2.start();
        Thread t3 = new IncrementerThread();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
