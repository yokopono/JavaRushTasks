package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(s1);

        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream2 = new FileOutputStream(s2);

        byte[] bytes = new byte[inputStream1.available()];
        while (inputStream1.available() > 0) {
            inputStream1.read(bytes);
        
        }
        
        for (int i = bytes.length-1; i >= 0; i--) {
            int a = bytes[i];
            outputStream2.write(a);
        }
    
        reader.close();
        inputStream1.close();
        outputStream2.close();

    }
}
