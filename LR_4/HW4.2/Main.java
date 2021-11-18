package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> planets = new HashMap<String, ArrayList<Integer>>();

        ArrayList<Integer> Mercury = new ArrayList<Integer>();
        Mercury.add(58);
        Mercury.add(3);
        Mercury.add(4880);
        planets.put("Mercury", Mercury);

        ArrayList<Integer> Venus = new ArrayList<Integer>();
        Venus.add(108);
        Venus.add(50);
        Venus.add(12100);
        planets.put("Venus", Venus);

        ArrayList<Integer> Earth = new ArrayList<Integer>();
        Earth.add(150);
        Earth.add(60);
        Earth.add(12756);
        planets.put("Earth", Earth);

        ArrayList<Integer> Mars = new ArrayList<Integer>();
        Earth.add(228);
        Earth.add(6);
        Earth.add(6790);
        planets.put("Mars", Mars);

        System.out.println("\tвведите имя планеты:");
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        if (planets.containsKey(key)) {
            System.out.println("\tрасстояние до Солнца [км]: " + planets.get(key).get(0) + " * 10^6" +
                    "\n\tмасса [кг]: " + planets.get(key).get(1) + " * 10^23" +
                    "\n\tдиаметр [км]: " + planets.get(key).get(2));
        }
        else {
            System.out.println("в списке нет такой планеты");
        }
    }
}
