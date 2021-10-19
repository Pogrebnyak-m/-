package com.company;

public class ComplexNumbers implements ArithmeticOperations{
    public Params add(Params a, Params b){
        return new Params(a.getRe() + b.getRe(), a.getIm() + b.getIm());
    }

    public Params subtract(Params a, Params b){
        return new Params(a.getRe() - b.getRe(), a.getIm() - b.getIm());
    }

    public Params multiply(Params a, Params b){
        return new Params(a.getRe() * b.getRe() - a.getIm() * b.getIm(), a.getIm() * b.getRe() + a.getRe() * b.getIm());
    }

    public Params divide(Params a, Params b){
        return new Params((a.getRe() * b.getRe() + a.getIm() * b.getIm()) / (Math.pow(a.getIm(), 2) + Math.pow(b.getIm(), 2)),
                (a.getIm() * b.getRe() - a.getRe() * b.getIm()) / (Math.pow(a.getIm(), 2) + Math.pow(b.getIm(), 2)));
    }
}
