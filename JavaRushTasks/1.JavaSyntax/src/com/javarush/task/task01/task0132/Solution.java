package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args){
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
       String s = String.valueOf(number);
       char[] arr = s.toCharArray();
       int a =0;
        for (int i = 0; i < arr.length; i++) {
            a+=Integer.parseInt(String.valueOf(arr[i]));

        }
        return a;
    }
}