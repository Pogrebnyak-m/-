package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        String value = "д";
        while (!value.equals("н")){
            Scanner sc = new Scanner(System.in);
            System.out.print("\tВведите имя: ");
            String name = sc.nextLine();
            System.out.print("\tВведите возраст: ");
            Integer age = sc.nextInt();
            System.out.print("\tВведите средний балл: ");
            Double averageScore = sc.nextDouble();

            students.add(new Student(name, age, averageScore));

            System.out.print("Хотите продолжить? [д/н]");
            do{
                value = sc.nextLine();

            }while (!value.equals("д") && !value.equals("н"));
        }

        Student max = new Student("some name",0,0.0);
        for (Student i: students) {
             if(i.getAverageScore() > max.getAverageScore())
                max = i;
        }
        System.out.println("Полная информация о студенте с самым высоким баллом:" +
                "\n\tИмя: " + max.getName() + "\n\tВозраст: " + max.getAge() +
                "\n\tСредний балл:  " + max.getAverageScore());
    }
}
