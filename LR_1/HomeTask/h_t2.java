package com.company;
import java.util.Scanner;

public class h_t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Names =  new String[] { "Саша", "Даша", "Маша", "Наташа"};
        /*String[] name = { "Саша"};*/

        System.out.println("введите имя:");
        String name = sc.next();
        for (String s : Names) {
            if (s.equals(name)) {
                System.out.println("имя есть в массиве");
            }
            else {
                System.out.println("имени нет в массиве");}
        }
    }
}
