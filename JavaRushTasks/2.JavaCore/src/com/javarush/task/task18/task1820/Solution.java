package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
        String s2= reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);
        FileOutputStream fileOutputStream = new FileOutputStream(s2);
        StringBuilder sb = new StringBuilder();
        while (fileInputStream.available()>0){
            sb.append(Character.toChars(fileInputStream.read()));
        }
        String[] numbers = sb.toString().split(" ");
        for (int i = 0; i < numbers.length; i++) {
            int d = Math.round(Float.parseFloat(numbers[i]));
            fileOutputStream.write(Integer.toString(d).getBytes());
            fileOutputStream.write(32);
        }
        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
