package com.javarush.task.task12.task1204;

/* 
Или «Кошка», или «Собака», или «Птица», или «Лампа»
*/

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if(Objects.equals(o.getClass().getSimpleName(), "Cat")) {
            System.out.println("Кошка");
        }else if (Objects.equals(o.getClass().getSimpleName(), "Dog")){
            System.out.println("Собака");
        }
        else if (Objects.equals(o.getClass().getSimpleName(), "Bird")){
            System.out.println("Птица");
        }
        else if (Objects.equals(o.getClass().getSimpleName(), "Lamp")){
            System.out.println("Лампа");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
