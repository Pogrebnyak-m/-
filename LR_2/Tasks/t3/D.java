package com.company;

public class D extends B{
    @Override
    public int count(int a, int b){
        System.out.println("4. частное:  " + (a / b));
        return a / b ;
    }

    @Override
    void show(){
        System.out.println("название класса: D");
    }
}
