package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int charCount = 0;
        int spaceCount = 0;
        while (fis.available() > 0) {
            int letter = fis.read();
            charCount++;
            if (letter == 32) spaceCount++;
        }
        fis.close();

        System.out.println(String.format("%.2f", (double) spaceCount / charCount * 100));
    }

}