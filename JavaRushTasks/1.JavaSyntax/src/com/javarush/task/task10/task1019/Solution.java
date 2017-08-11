package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных.
Числа могу повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap();

        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();

                map.put(name, id);

            }catch (IllegalArgumentException e){
                break;
            }
        }


        for (Map.Entry<String, Integer> zap :
        map.entrySet()) {
            System.out.println(zap.getValue() + " " + zap.getKey());//1 Мыла
        }
    }
}
