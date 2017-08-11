package com.javarush.task.task12.task1209;

/* 
Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int one, int two){
        if (one<two)
        return one;
        else return two;
    }
    public static  long min(long one, long two){
        if (one<two)
            return one;
        else return two;
    }
    public static double min(double one, double two){
        if (one<two)
            return one;
        else return two;
    }
}
