package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(s1);

        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream2 = new FileOutputStream(s2);
        FileOutputStream outputStream3 = new FileOutputStream(s3);

        if (inputStream1.available()%2==0){
            byte[] buffer = new byte[inputStream1.available()/2];
            int count = inputStream1.read(buffer);
            outputStream2.write(count);
            outputStream3.write(inputStream1.available());
            inputStream1.close();
            outputStream2.close();
            outputStream3.close();
        }else {
            byte[] buffer = new byte[(inputStream1.available()/2)+1];
            int count = inputStream1.read(buffer);
            outputStream2.write(count);
            outputStream3.write(inputStream1.available());
            inputStream1.close();
            outputStream2.close();
            outputStream3.close();

        }


    }
}
