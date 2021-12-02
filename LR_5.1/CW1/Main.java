package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i <= array.length; i++) {
            Scanner sc = new Scanner(System.in);
            String s;

            System.out.print("Введите число: ");
            s = sc.nextLine();

            System.out.print("Введите индекс элемента: ");
            try {
                array[i] = Integer.parseInt(s);

                int element = sc.nextInt();
                System.out.print("Элемент, соответствующий введённому индексу: " + array[element] + "\n");
            } catch (NumberFormatException e) {
                System.out.println("Сообщение: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Введенный индекс недействителен. Пожалуйста, введите число от 0 до 2 " + e.getMessage());
            }
        }
    }
}
