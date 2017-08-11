package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран номер первого элемента, нарушающего такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(scanner.readLine());
        }

        boolean isOrderedList = true;
        int lengthCurrent = list.get(0).length();
        int index = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < lengthCurrent) {
                isOrderedList = false;
                index = i;
                break;
            }

            lengthCurrent = list.get(i).length();
        }

        if (!isOrderedList) {
            System.out.println(index);
        }
    }
}

