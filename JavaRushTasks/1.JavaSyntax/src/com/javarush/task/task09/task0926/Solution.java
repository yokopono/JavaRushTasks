package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] i = new int[5];
        int[] i2 = new int[2];
        int[] i3 = new int[4];
        int[] i4 = new int[7];
        int[] i5 = new int[0];
        list.add(i);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        for (int j = 0; j < i.length; j++) {
            i[j]=j;}
        for (int j = 0; j < i2.length; j++) {
            i2[j]=j;}
        for (int j = 0; j < i3.length; j++) {
            i3[j]=j;}
        for (int j = 0; j < i4.length; j++) {
            i4[j]=j;}
        for (int j = 0; j < i5.length; j++) {
            i5[j]=j;}
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
