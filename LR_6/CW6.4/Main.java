package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        new Thread(() -> {
            try {
                Concatenator.concatenateString();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(500);
        Concatenator.showLength();
    }
}
