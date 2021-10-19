package com.company;

import java.util.Scanner;

public class Main {
    public static void length(String s) {
        System.out.println("Длина строки: " + s.length() + " символа(ов)");
    }

    public static void hash(String s) {
        System.out.println("Хэш-код для строки: " + s.hashCode());
    }

    public static void reverse(String s) {
        System.out.println("Обратная последовательность строки: " + new StringBuilder(s).reverse().toString());
    }

    public static void substring(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Поочередно введите границы для возвращаемой строки, максимальный диапазон [0; длина строки]" + "\nГраница 1:");
        String boundary1 = sc.nextLine();
        int boundary1_1 = Integer.parseInt(boundary1);
        System.out.println("Граница 2:");
        String boundary2 = sc.nextLine();
        int boundary2_2 = Integer.parseInt(boundary2);

        System.out.println("Возвращаемая строка: " + s.substring(boundary1_1, boundary2_2));
    }

    public static void error() {
        System.out.println("Не является командой, исполняемой программой");
    }

    public static void main(String[] args) {
        String exit;
        exit = "0";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст (для завершения работы программы введите exit):");
        String text = sc.nextLine();

        while (exit.equals("exit") == false) {
            System.out.println("Выберите одну из команд [length, hash, reverse, substring]:");
            String str = sc.nextLine();

            switch (str) {
                case "length":
                    length(text);
                    break;
                case "hash":
                    hash(text);
                    break;
                case "reverse":
                    reverse(text);
                    break;
                case "substring":
                    substring(text);
                    break;
                default:
                    error();
            }
            System.out.println("Для завершения работы программы введите exit, для продолжения нажмите enter");
            String s = sc.nextLine();

            if (s.equals("exit") == true) {
                exit = "exit";
            }

        }

    }
}
