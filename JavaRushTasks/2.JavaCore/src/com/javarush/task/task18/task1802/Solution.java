package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);
        int theSmall = Integer.MAX_VALUE;
        while (fileInputStream.available()>0){
            int data = fileInputStream.read();
            if (data<theSmall){
                theSmall=data;
            }
        }
        fileInputStream.close();
        System.out.println(theSmall);


    }
}
