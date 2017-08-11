package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
Массивный максимум
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] massiv = new int[20];
        for (int j = 0; j < massiv.length; j++) {
            massiv[j]=Integer.parseInt(reader.readLine());
        }
        return massiv;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
           if (array[i]>max){
               max=array[i];
           }
        }
        return max;
    }
}
