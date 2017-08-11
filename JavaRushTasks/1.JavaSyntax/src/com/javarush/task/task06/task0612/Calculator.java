package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {

        return a+b;
    }

    public static int minus(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static double division(int a, int b) {
       double d = (double) a/b;
        return d;
    }

    public static double percent(int a, int b) {
        return (double) a*b/100;
    }

    public static void main(String[] args) {
    Calculator.plus(5,5);
    Calculator.minus(5,5);
    Calculator.multiply(5,5);
    Calculator.division(5,5);
    Calculator.percent(5,5);
    }
}