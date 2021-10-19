package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static String longestWord;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = sc.nextLine();

        String str = text;
        StringTokenizer st = new StringTokenizer(str);
        //счет слов
        int count = st.countTokens();
        //счет букв
        int charСount = str.replace(" ", "").length();
        //самое длинное слово
        int length = 0;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            int wordLength = word.length();
            if ( length == 0) {
                longestWord = word;
                length = wordLength;
            } else if (wordLength > length) {
                length = wordLength;
                longestWord = word;
            }
        }

        System.out.println("\tЧисло слов: " + count);
        System.out.println("\tЧисло символов без пробелов: " + charСount);

        if ( length > 0) {
            System.out.println("\tСлово с максимальной длиной: " + longestWord);
        } else {
            System.out.println("\tПустая строка");
        }

    }
}
