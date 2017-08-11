package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение — число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы
проживает больше жителей.
4. Вывеси на экран сообщение: «В домах с нечетными номерами проживает больше жителей.» или «В домах с четными номерами
 проживает больше жителей.»

Примечание:
дом с порядковым номером 0 считать четным.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] massiv = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            int a = Integer.parseInt(reader.readLine());
            massiv[i] = a;
        }
        int left = 0;
        int right = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0) left += massiv[i];
            else right += massiv[i];

        }
        if (left > right) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else
            System.out.println("В домах с четными номерами проживает больше жителей.");

    }
}

