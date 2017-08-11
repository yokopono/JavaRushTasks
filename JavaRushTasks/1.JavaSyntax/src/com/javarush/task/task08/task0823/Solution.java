package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] ch = s.toCharArray();
        boolean probelnet = false;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]==' '){
                probelnet = false;}
            if (!probelnet && ch[i]!=' '){
                ch[i] = Character.toUpperCase(ch[i]);
                probelnet = true;
            }
            }
        System.out.println(ch);
    }
}
