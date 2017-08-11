package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р")) {
                if (list.get(i).contains("л") == false) {
                    list.remove(i);
                    i--;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("л")) {
                if (list.get(i).contains("р") == false) {
                    list.add(i, list.get(i));
                    i++;
                }
            }
        }
        return list;
    }
    }
