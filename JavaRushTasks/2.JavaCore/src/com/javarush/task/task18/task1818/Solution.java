package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
        String s2= reader.readLine();
        String s3= reader.readLine();
        FileInputStream fis = new FileInputStream(s2);
        FileInputStream fis2 = new FileInputStream(s3);
        FileOutputStream fileOutputStream = new FileOutputStream(s);
        while (fis.available() > 0) {
            int letter = fis.read();
            fileOutputStream.write(letter);
        }
        fis.close();
        while (fis2.available() > 0) {
            int letter = fis2.read();
            fileOutputStream.write(letter);
        }
        fis2.close();
        fileOutputStream.close();

    }
}
