package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject//допишите здесь ваш код
    {
        public SimpleObject getInstance(String s) {
            return null;
        }

        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }
}