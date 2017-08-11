package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());
        int i3 = Integer.parseInt(reader.readLine());
        int i4 = Integer.parseInt(reader.readLine());
        int i5 = Integer.parseInt(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.sort(Integer::compareTo);
        for(int i = 0; i < list.size(); i++){
            System.out.println( list.get(i).intValue());
        }
    }
}
