package com.company;

public class MyThread extends Thread{
    private boolean run = true;
    @Override
    public void run() {
        while(run) {
            System.out.println("Trying to connect");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    void terminate() {
        run = false;
    }
}
