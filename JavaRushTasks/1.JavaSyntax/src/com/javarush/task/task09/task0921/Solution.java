package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Обернуть все тело (код внутри readData) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и
 вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList<Integer>();
        try {
          while (true){
                list.add( Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException e) {
            for (Object i:list) {
                System.out.println(i);
            }
        }
        catch (IOException e) {
            for (Object i:list) {
                System.out.println(i);
            }
        }

    }
}
