package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = null;
        int x = 0;
        try {
            fileInputStream = new FileInputStream(s);
            while (fileInputStream.available() > 0) {
                if (fileInputStream.read() == (byte)','){
                    x++;
                }
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found, idiot");

        }
        System.out.println(x);
    }
}
