package com.company;

public class t1 {
    public static void main(String[] args) {
        String str = "1";
        int a = useInteger(str);
        double b = useDouble(str);
        double c = a + b;
        System.out.println(c);
    }
    public static int useInteger(String a1){
        return Integer.parseInt(a1);
    }

    public static double useDouble(String b1){
        return Double.parseDouble(b1);
    }
}
