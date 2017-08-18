package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader in = new BufferedReader( new FileReader(args[0]));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        String s2 = sb.toString();
        char[] ch = s2.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int c = ch[i];
            if (c >= 97 && c <= 122 || c >= 65 && c <= 90)
                count++;
        }
        System.out.println(count);
    }

}
