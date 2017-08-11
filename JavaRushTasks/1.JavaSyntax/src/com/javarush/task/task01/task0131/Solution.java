package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
Полнометражная картина
Реализуй метод getMetreFromCentimetre(int centimetre).
Метод на вход принимает количество сантиметров. Нужно сделать так, чтобы метод возвращал число полных метров в centimetre.
(1 метр = 100 см).

Пример:
Метод getMetreFromCentimetre вызывается с параметром 243.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int metr = centimetre/100;
       return metr;
    }
}