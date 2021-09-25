package com.company;

public class B extends A{
    @Override
    public int count(int a, int b){
        System.out.println("2. разность:  " + (a - b));
        return a - b ;
    }

    @Override
    void show(){
        System.out.println("название класса: B");
    }
}
