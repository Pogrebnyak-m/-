package com.company;

public class Main {

    public static void main(String[] args) {
        Thread t = new Thread(new SomeTask());
        for (int i = 0; i < 3; i++) {
            Thread t1 = new Thread(new SomeTask());
            t1.setName("t1");

            Thread t2 = new MyThread();
            t2.setName("t2");

            t1.start();
            t2.start();

        }
    }
}
