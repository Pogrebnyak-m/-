package com.company;

import java.util.Random;

public class Host extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from worker thread!");
        MyThread t = new MyThread();
        t.start();
        Random rand = new Random();
        try {
            Thread.sleep(rand. nextInt(50000)+10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.terminate();
    }
}
