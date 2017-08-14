package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (1==1) {
           String s1 = reader.readLine();

            FileInputStream inputStream1 = new FileInputStream(s1);
             if (inputStream1.available() < 1000) {
                inputStream1.close();
                throw new DownloadException();
            }
            else {inputStream1.close();

            }}



    }

    public static class DownloadException extends Exception {

    }
}
