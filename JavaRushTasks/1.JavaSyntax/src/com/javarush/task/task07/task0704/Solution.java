package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[10];
        for (int i = array1.length-1; i>=0; i--) {
            int j = Integer.parseInt(reader.readLine());
            array1[i]=j;
        }
        for (int i = 0; i < array1.length; i++) {
        System.out.println(array1[i]);
        }

    }
}

