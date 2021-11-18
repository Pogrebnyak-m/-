package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String string = "Java is a programming language that is concurrent, class-based and object-oriented.";
        StringTokenizer str = new StringTokenizer(string, " ,.");

        Set<String> set = new HashSet<String>();
        while (str.hasMoreTokens()){
            set.add(str.nextToken());
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toString().length() <= 3)
                iterator.remove();
        }

        SortedSet<String> sortedSet = new TreeSet(set);
        System.out.println(sortedSet);

    }
}
