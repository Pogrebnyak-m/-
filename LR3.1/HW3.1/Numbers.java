package com.company;

public class Numbers implements ArithmeticOperations{
    public Params add(Params a, Params b){
        return new Params(a.getRe() + b.getRe(), 0);
    }

    public Params subtract(Params a, Params b){
        return new Params(a.getRe() - b.getRe(), 0);
    }

    public Params multiply(Params a, Params b){
        return new Params(a.getRe() * b.getRe(), 0);
    }

    public Params divide(Params a, Params b){
        return new Params(a.getRe() / b.getRe(), 0);
    }
}
