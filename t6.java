package com.company;
import java.util.Random;
import java.util.Arrays;

public class t6 {
    public static void main(String[] args) {
        int[] A=new int[15];
        for (int i=0; i<A.length; i++)
            A[i]=new Random().nextInt(15);
        System.out.println(Arrays.toString(A));
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int[] B=Arrays.copyOfRange(A, 0,5);
        int[] C=Arrays.copyOfRange(A, 10,15);
        int[] resultArray=new int[B.length+C.length];
        int count = 0;
        for(int i = 0; i<B.length; i++) {
            resultArray[i] = B[i];
            count++;
        }
        for(int j = 0;j<C.length;j++) {
            resultArray[count++] = C[j];
        }
        for(int i = 0;i<resultArray.length;i++)
            System.out.print(resultArray[i]+" ");
    }
}
