package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[20];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            int j = Integer.parseInt(reader.readLine());
            array1[i]=j;
        }


        for (int i = 0; i <= 9; i++) {
            array2[i]= array1[i];
        }
        for (int i = 0; i <array3.length; i++) {
            array3[i] =array1[i+10];
        }
        for (int i = 0; i <array3.length ; i++) {
            System.out.println(array3[i]);
        }
    }
}
