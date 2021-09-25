package com.company;

public class C extends A{
    @Override
    public int count(int a, int b){
        System.out.println("3. произведение:  " + (a * b));
        return a * b ;
    }

    @Override
    void show(){
        System.out.println("название класса: C");
    }
}
