package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, Planet> planets = new HashMap<String, Planet>();
        planets.put("Mercury", new Planet(58, 3.26, 4880));
        planets.put("Venus", new Planet(108, 48.8, 12100));
        planets.put("Earth", new Planet(149.5, 59.7 , 12756));
        planets.put("Mars", new Planet(228, 6.43, 6790));

        System.out.println("\tвведите имя планеты:");
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        if (planets.containsKey(key)) {
            System.out.println("\tрасстояние до Солнца [км]: " + planets.get(key).getDistanceToSun() + " * 10^6" +
                    "\n\tмасса [кг]: " + planets.get(key).getMass() + " * 10^23" +
                    "\n\tдиаметр [км]: " + planets.get(key).getDiameter());
        }
        else {
            System.out.println("в списке нет такой планеты");
        }
    }
}
