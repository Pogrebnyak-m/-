package com.company;

import java.util.Scanner;
//

public class Main {
  
    public static void main(String[] args) {
        String determination;
        String model1;
        double maxSpeed1 = 0;
        String weight1;
        double weight2 = 0;
        Car car;

        do{
            Scanner sc = new Scanner(System.in);

            System.out.print("введите модель: ");
            String model = sc.nextLine();
            System.out.print("ввод максимальной скорости? [y/n]");
            model1 = sc.next();
            if ("y".equals(model1)){
                System.out.print("введите максимальную скорость: ");
                maxSpeed1 = sc.nextDouble();
            }
            System.out.print("ввод веса? [y/n]");
            weight1 = sc.next();
            if("y".equals(weight1)){
                System.out.print("введите вес: ");
                weight2 = sc.nextDouble();
            }
            if ("y".equals(model1) && "y".equals(weight1)){
                car = new Car(model, maxSpeed1, weight2);
            } else if ("y".equals(model1)){
                car = new Car(model, maxSpeed1);
            } else {
                car = new Car(model);
            }

            car.show();
            System.out.print("\nхотите продолжить? [y/n]");
            determination = sc.next();
        } while (!determination.equals("n"));
    }
}
