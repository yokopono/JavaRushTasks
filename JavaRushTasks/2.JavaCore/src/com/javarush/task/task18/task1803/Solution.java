package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = null;
        ArrayList<Integer> list = null;
        try {
            fileInputStream = new FileInputStream(s);
            list = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                list.add(fileInputStream.read());
            }
            fileInputStream.close();
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            Integer am;
            for (Integer i : list) {

                am = hm.get(i);
                hm.put(i, am == null ? 1 : am + 1);
            }
            int i = Collections.max(hm.values());
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                if (list.isEmpty()) {
                    break;
                } else if (entry.getValue().equals(i)) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found, idiot");

        }



    }

}
