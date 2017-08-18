package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
        String s2= reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);
        FileOutputStream fileOutputStream = new FileOutputStream(s);
        FileInputStream fileInputStream2 = new FileInputStream(s2);


        byte[] buffer = new byte[fileInputStream.available()];
        byte[] buffer2 = new byte[fileInputStream2.available()];
        while (fileInputStream.available()>0){
            int c = fileInputStream.read(buffer);
            int c2 = fileInputStream2.read(buffer2);
            fileOutputStream.write(buffer2,0,c2);
            fileOutputStream.write(buffer,0,c);
        }
        reader.close();
        fileInputStream.close();
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
