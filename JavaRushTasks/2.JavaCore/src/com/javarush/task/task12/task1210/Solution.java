package com.javarush.task.task12.task1210;

/* 
Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int one, int two) {
        if (one > two)
            return one;
        else return two;
    }

    public static long max(long one, long two) {
        if (one > two)
            return one;
        else return two;
    }

    public static double max(double one, double two) {
        if (one > two)
            return one;
        else return two;
    }
}
