package com.company;

 public class Car {
     String model;
     double maxSpeed = 0;
     double weight = 0;

     public Car(String model1){
         this.model = model1;
     }
     public Car(String model2, double maxSpeed1){
         this.model = model2;
         this.maxSpeed = maxSpeed1;
     }
     public Car(String model2,double maxSpeed1,double weight1 ){
         this.model = model2;
         this.maxSpeed = maxSpeed1;
         this.weight = weight1;
     }

     public void show(){
         System.out.print("модель: " + model + "; ");
         if(maxSpeed != 0){
             System.out.print("максимальная скорость: " + maxSpeed + "; ");
         }
         if(weight != 0){
             System.out.print("вес: " + weight);
         }
     }
}



