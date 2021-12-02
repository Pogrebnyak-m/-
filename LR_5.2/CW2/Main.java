package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File in = new File("D:\\3 семестр\\ЯП\\лекции\\test1.txt");
        File out = new File("D:\\3 семестр\\ЯП\\лекции\\test2.txt");

        try {
            in.createNewFile();
            out.createNewFile();
            Writer writer = new FileWriter(in);
            writer.write("что-нибудь");
            writer.close();

            FileInputStream inputStream = new FileInputStream(in);
            FileOutputStream outputStream = new FileOutputStream(out);

            byte[] buffer = {};
            inputStream.read(buffer);
            System.out.println(buffer);
            outputStream.write(buffer);

            Reader reader = new FileReader(out);
            char[] str = {};
            reader.read(str);
            System.out.println(str);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
