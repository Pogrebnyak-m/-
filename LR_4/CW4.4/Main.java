package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> planets = new HashMap<String, Integer>();
        planets.put("Mercury", 58);
        planets.put("Venus", 108);
        planets.put("Earth", 150);
        planets.put("Mars", 228);

        System.out.println("\tвсе ключи:");
        for (String key: planets.keySet()) {
            System.out.println(key);
        }

        System.out.println("\tвсе значения:");
        for (int value: planets.values()) {
            System.out.println(value);
        }

        System.out.println("\tвведите ключ:");
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        if (planets.containsKey(key)) {
            System.out.println("этому ключу соответствует значение: " + planets.get(key));
        }
        else {
            System.out.println("в коллекции нет такого ключа");
        }

        System.out.println("введите значение: ");
        int value = sc.nextInt();
        if (planets.containsValue(value)) {
            for (Map.Entry<String, Integer> e : planets.entrySet()) {
                if (e.getValue() == value) {
                    System.out.println("этому значению соответствует ключ " + e.getKey());
                }
            }
        }
        else {
            System.out.println("в коллекции нет такого значения");
        }
    }
}
