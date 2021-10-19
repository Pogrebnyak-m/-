package com.company;

public class Main {

    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        String s1 = new String("Hello,");

        for (int i = 0; i <= 20000; i++){
            s1 += " world!";
        }

        long finish1 = System.currentTimeMillis();
        long elapsed1 = finish1 - start1;
        System.out.println("\tВремя [мс] выполнения операции с помощью оператора + : " + elapsed1);


        long start2 = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i <= 20000; i++) {
            s2.append("Hello,").append("world!");
        }

        long finish2 = System.currentTimeMillis();
        long elapsed2 = finish2 - start2;
        System.out.println("\tВремя [мс] выполнения операции с помощью StringBuilder: " + elapsed2);
    }
}
