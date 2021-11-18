package com.company;

public class Student {
    private String name;
    private int age;
    private double averageScore;

    public Student( String name1, int age1, double averageScore1 ){
        this.name = name1;
        this.age = age1;
        this. averageScore = averageScore1;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getAverageScore() {
        return averageScore;
    }
}
