package com.company;

public class Paragraph extends Header_title {
    @Override
    public  void weight(){
        System.out.println("weight: 300;" + "\n}");
    }
    @Override
    public void show(){
        System.out.println(".paragraph{");
    }
}
