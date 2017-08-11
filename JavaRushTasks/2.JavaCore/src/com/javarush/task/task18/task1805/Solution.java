package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = null;
        ArrayList<Integer> list = null;
        try {
            fileInputStream = new FileInputStream(s);
            list = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                list.add(fileInputStream.read());
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found, idiot");

        }
        Set<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> list2 = new ArrayList<>(set);
        Collections.sort(list2);
        System.out.println(list2);
        fileInputStream.close();
    }
}
