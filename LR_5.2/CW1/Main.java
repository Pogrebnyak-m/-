package com.company;

import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	File dir = new File("D:\\3 семестр\\ЯП\\лекции");

    String[] files = dir.list();
    if (files != null){
        Arrays.sort(files);
    }

    System.out.println(Arrays.toString(files));
    System.out.println();

    String path = "D:\\3 семестр\\ЯП\\лекции\\test.txt";
    File f = new File(path);

        try {
            if (!f.exists()) {
                f.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        files = dir.list();
        if (files != null) {
            Arrays.sort(files);
        }

        System.out.println(Arrays.toString(files));

    }
}
