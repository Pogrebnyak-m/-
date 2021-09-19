package com.company;

public class Circle {
        int x;
        int y;
        int r;
        public void print(){
            System.out.println("Координаты: " + "x = "+ x + " " + "y = "+ y + "\nРадиус: "+ "r = " +r);
        }
        public void move(){
        }
        public double distToOtherCircle(){
                double x1 = x+2;
                return x1;
        }
        public void changeRadius(){
                int r = 3*y;
        }
        public double getPerimetr(){
                double p = 2*Math.PI*r;
                return p;
        }
        public double getSquare(){
                double s = Math.PI*Math.pow(r, 2);
                return s;
        }
        Circle(int x1, int y1, int r1){
                x = x1;
                y = y1;
                r = r1;
        }
}
