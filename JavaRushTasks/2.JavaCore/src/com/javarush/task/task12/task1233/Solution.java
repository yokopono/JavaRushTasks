package com.javarush.task.task12.task1233;

/* 
Задача по алгоритмам
*/


import java.util.Arrays;

public class Solution {


    static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        int min=Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min>array[i]){
                min=array[i];
                index=i;
            }
        }
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        else return new Pair<Integer,Integer>(min,index);}
    }

