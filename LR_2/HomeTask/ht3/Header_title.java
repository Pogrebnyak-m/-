package com.company;

public class Header_title extends Text {

    @Override
    public void text_transform(){
        System.out.println("text-transform: uppercase;");
    }
    @Override
    public  void weight(){
        System.out.println("weight: 600;" + "\n}");
    }
    @Override
    public void show(){
        System.out.println(".header_title{");
    }
}
