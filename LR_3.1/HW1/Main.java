package com.company;

public class Main {

    public static void main(String[] args) {
        Params a = new Params(10, 2);
        Params b = new Params(5, 1);

        ArithmeticOperations operations = new Numbers();
        ArithmeticOperations operationsIm = new ComplexNumbers();

        System.out.println("real numbers:" + "\n1. sum =  " + operations.add(a, b).getRe() +
                "\n2. difference =  " + operations.subtract(a, b).getRe() +
                "\n3. product =  " + operations.multiply(a, b).getRe() +
                "\n4. quotient =  " + operations.divide(a, b).getRe());

        System.out.println("complex numbers:" + "\n1. sum =  " + operations.add(a, b).getRe() + " + " + operationsIm.add(a, b).getIm() +
                "\n2. difference =  " + operations.subtract(a, b).getRe() + " + " + operationsIm.subtract(a, b).getIm() +
                "\n3. product =  " + operationsIm.multiply(a, b).getRe() + " + " + operationsIm.multiply(a, b).getIm() +
                "\n4. quotient =  " + operationsIm.divide(a, b).getRe() + " + " + operationsIm.divide(a, b).getIm());
    }

}
