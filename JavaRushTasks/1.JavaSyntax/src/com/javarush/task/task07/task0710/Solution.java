package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
В начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list.add(9,reader.readLine());
            list.add(8,reader.readLine());
            list.add(7,reader.readLine());
            list.add(6,reader.readLine());
            list.add(5,reader.readLine());
            list.add(4,reader.readLine());
            list.add(3,reader.readLine());
            list.add(2,reader.readLine());
            list.add(1,reader.readLine());
            list.add(0,reader.readLine());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
