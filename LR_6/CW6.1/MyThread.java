package com.company;

import java.util.Date;

public class MyThread extends Thread{
    @Override
    public void run() {
        Date date=java.util.Calendar.getInstance().getTime();
        System.out.println(date);
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
