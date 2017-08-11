package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] lists = new ArrayList[5];
        lists[0]=new ArrayList<String>();
        lists[1]=new ArrayList<String>();
        lists[2]=new ArrayList<String>();
        lists[3]=new ArrayList<String>();
        lists[4]=new ArrayList<String>();
        lists[0].add("sss");
        lists[1].add("sss");
        lists[2].add("sss");
        lists[3].add("sss");
        lists[4].add("sss");

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}