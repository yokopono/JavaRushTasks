package com.javarush.task.task12.task1205;

/* 
Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
*/

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if(Objects.equals(o.getClass().getSimpleName(), "Cow")) {
            return "Корова";
        }else if (Objects.equals(o.getClass().getSimpleName(), "Dog")){
           return "Собака";
        }
        else if (Objects.equals(o.getClass().getSimpleName(), "Whale")){
          return "Кит";
        }
        else
        return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
