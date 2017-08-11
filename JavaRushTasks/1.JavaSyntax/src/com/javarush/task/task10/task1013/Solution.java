package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private String secondName;
        private Human maman;
        private int ves;

        public Human(String name, Human maman) {
            this.name = name;
            this.maman = maman;
        }

        public Human(String name, Human maman, int ves) {
            this.name = name;
            this.maman = maman;
            this.ves = ves;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human() {

        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age, boolean sex, String secondName, Human maman) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.secondName = secondName;
            this.maman = maman;
        }

        public Human(String name, int age, boolean sex, String secondName) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.secondName = secondName;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex, String secondName, Human maman, int ves) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.secondName = secondName;
            this.maman = maman;
            this.ves = ves;
        }
    }
}
