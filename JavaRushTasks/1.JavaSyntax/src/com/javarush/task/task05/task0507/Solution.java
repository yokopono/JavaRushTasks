package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int middle = 0;
        int ch=0;
        boolean a = true;
        while (a) {
            ch++;
            int b = Integer.parseInt(reader.readLine());
            middle+=b;
            if (b == -1) {
                a = false;
            }
        }
        System.out.println((double) (middle+1)/(ch-1));
    }
}

