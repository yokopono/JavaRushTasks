package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
1. Измени класс GenerateThread так, чтобы он стал нитью.
2. Создай конструктор GenerateThread, который должен:
2.1. Вызвать конструктор суперкласса с параметром String — номером созданной нити. Используй countCreatedThreads.
2.2. Запустить текущую нить.
2.3. Номер первой нити должен начинается с 1.
3. Переопредели метод toString, для этого внутри GenerateThread нажми Alt+Insert -> Override Methods. Начни печатать toString.
3.1. Метод toString должен возвращать № текущей нити и слово « created«. Используй getName().
*/
public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.valueOf(++countCreatedThreads));
            start();
        }

        @Override
        public void run() {
            if (countCreatedThreads<Solution.count) {
                GenerateThread generateThread=new GenerateThread();
                System.out.println(generateThread);
            }
        }

        @Override
        public String toString() {
            return  super.getName()+" created";
        }
    }
}

