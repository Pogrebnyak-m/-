package com.company;

public class Menu_links extends Text {
    @Override
    public void text_transform(){
        System.out.println("text-transform: lowercase;" + "\n}");
    }
    @Override
    public void show(){
        System.out.println(".menu_links{");
    }
}
