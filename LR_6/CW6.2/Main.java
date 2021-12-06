package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        Thread t = new Host();
        t.start();
    }
}
