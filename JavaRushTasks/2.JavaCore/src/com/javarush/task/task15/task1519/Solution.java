package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
2. Для каждого значения, кроме «exit«, вызвать метод print. Если значение:
2.1. содержит точку ‘.‘, то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше нуля или больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            while (true) {
                String value = reader.readLine();
                if (value.equals("exit")) break;
                try {
                    if (Integer.parseInt(value)>127 || Integer.parseInt(value)<1) print(Integer.parseInt(value));
                    else print(Short.parseShort(value));
                }
                catch (Exception e1){
                    try {
                        print(Double.parseDouble(value));
                    }
                    catch (Exception e2){
                        print(value);
                    }
                }

            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
