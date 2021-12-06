package com.company;

public class IncrementerThread extends Thread{

    private static int counter;

    static void inc() {
        counter++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            inc();
        }
    }
}
