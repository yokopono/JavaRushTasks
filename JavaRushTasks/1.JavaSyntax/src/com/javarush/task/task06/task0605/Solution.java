package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
«Недовес: меньше чем 18.5» — если индекс массы тела меньше 18.5,
«Нормальный: между 18.5 и 24.9» — если индекс массы тела между 18.5 и 24.9,
«Избыточный вес: между 25 и 29.9» — если индекс массы тела между 25 и 29.9,
«Ожирение: 30 или больше» — если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());




    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double d = weight / (height*height);
            if (d<18.5) System.out.println("Недовес: меньше чем 18.5");
            else if (d>18.5 &&d<=24.9){
                System.out.println("Нормальный: между 18.5 и 24.9");
            }
            else if (d>25 &&d<=29.9){
                System.out.println("Избыточный вес: между 25 и 29.9");
            }
            else if (d>30){
                System.out.println("Ожирение: 30 или больше");
            }

    }}
}
