package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] Names =  new String[] { "Саша", "Даша", "Маша", "Наташа"};
        String found = "имени нет в массиве";
        Scanner sc = new Scanner(System.in);
        System.out.println("введите имя:");
        String searchedValue = sc.next();
        for(String x : Names){
            if(x.equals(searchedValue)){
                found = "имя есть в массиве";
                break;
            }
        }
        System.out.println(found);
    }
}


     


  





