package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] arr1 = {"за", "ночь", "прийти", "успеет", "зима"};
        Integer[] arr2 = {1, 3, 5, 7, 9};
        Double[] arr3 = {1.2, 3.4, 5.6, 7.8, 9.0};

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Меркурий");
        hashSet.add("Венера");
        hashSet.add("Земля");

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

        printCollection(list);
        printCollection(hashSet);

    }
    public static void printArray(Object[] ar){
        System.out.print("\n");
        for (Object array : ar) {
            System.out.print(array + " ");
        }
    }

    public static void printCollection(Collection col){
        System.out.print("\n");
        for (Object collection : col) {
            System.out.print(collection + " ");
        }
    }
}
