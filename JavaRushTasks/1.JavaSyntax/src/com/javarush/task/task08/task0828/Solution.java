package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December",12);
        for (int i = 0; i < map.size(); i++) {
            if (map.containsKey(s)){
                System.out.println(s + " is "+ map.get(s) +" month");
                break;
            }
        }
    }
}
