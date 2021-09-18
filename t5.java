package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class t5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int j = in.nextInt();
        int A[] = new int[j];
        int B[] = new int[j];
        System.out.println("Заполните первую матрицу:");
        for (int i = 0; i < j; i++) {
            A[i] = in.nextInt();
        }
        System.out.println("Заполните вторую матрицу");
        for (int k = 0; k < j; k++) {
            B[k] = in.nextInt();
        }
        for (int i = 0; i < j; i++)
            if (A[i] != B[i]) {
                System.out.println(i);
            }
    }

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int s = in.nextInt();
        int[] A=new int[s];
        for (int i=0; i<A.length; i++)
            A[i]=new Random().nextInt(15);
        System.out.println(Arrays.toString(A));
        int[] B=new int[s];
        for (int i=0; i<B.length; i++)
            B[i]=new Random().nextInt(15);
        System.out.println(Arrays.toString(B));

        for (int i = 0; i < A.length; i++)
            if (A[i] != B[i]) {
                System.out.println(i);
            }
    }*/
}
