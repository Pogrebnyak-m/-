package com.company;

import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Queue<Character> qc = new LinkedList<Character>();

        qc.add((char) 1);
        qc.add((char) 2);
        qc.add((char) 3);
        for(int pq : qc) {
            System.out.println(pq);
        }

    }
}
