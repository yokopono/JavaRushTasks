package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        String s = c.readLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
        ArrayList list = new ArrayList();
        while (reader.ready()) {
            int i = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        for (Object l:list) {
            System.out.println(l);
        }
        reader.close();
        c.close();

}}