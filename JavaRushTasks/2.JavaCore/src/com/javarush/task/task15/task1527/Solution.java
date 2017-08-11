package com.javarush.task.task15.task1527;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) — для чисел (дробные числа разделяются точкой)
alert(String value) — для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double 3.14


Требования:
1. Программа должна считывать с клавиатуры только одну строку.
2. Программа должна выводить данные на экран в соответствии с условием.
3. Программа должна вызывать метод alert с параметром double в случае, если значение параметра obj может быть корректно преобразовано
 в число типа double.
4. Программа должна вызывать метод alert с параметром String в случае, если значение параметра obj НЕ может быть корректно преобразовано
в число типа double.
*/

public class Solution {
    public static void main(String[] args) throws IOException   {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int index = url.indexOf("?") + 1;
        String sub = url.substring(index);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> alertList = new ArrayList<String>();
        String[] strings = sub.split("&");
        for (String s : strings)
        {
            if (s.contains("="))
            {
                String[] splitS = s.split("=");
                String potentialAlert = splitS[0];
                list.add(potentialAlert);
                if (potentialAlert.equals("obj"))
                    alertList.add(splitS[1]);
            } else
                list.add(s);


            //add your code here
        }
        for (String s : list)
        {
            System.out.print(s + " ");
        }
        System.out.println("");
        for (String s : alertList)
        {
            try
            {
                alert(Double.parseDouble(s));
            }
            catch (Exception e)
            {
                alert(s);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
