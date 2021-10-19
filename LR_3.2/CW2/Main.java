package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String value = "y";
        int iterations = 0;
        StringBuilder result = new StringBuilder();

        while (!value.equals("n")){
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите текст: ");
            String str = sc.nextLine();
            iterations = iterations + 1;

            result.append(str + "");

            System.out.print("Хотите продолжить? [y/n]");
            do{
                value = sc.nextLine();
                if (value.equals("y") == false && value.equals("n") == false){
                    System.out.print("\nНе является командой, исполняемой программой. Хотите продолжить? [y/n]");
                }
            }while (value.equals("y") == false && value.equals("n") == false);
        }
        System.out.print("\tВозвращаемая строка: " +  result.toString() + "\n\tДлина возвращаемой строки: " +  result.length() +
                "\n\tКоличество вводов: " + iterations);
    }
}
