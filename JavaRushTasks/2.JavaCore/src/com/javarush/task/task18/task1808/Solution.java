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

        while (inputStream1.available() > 0) {
            byte[] buff = new byte[inputStream1.available()];
            int count = inputStream1.read(buff);
            if (count%2==0) {
                outputStream2.write(buff, 0, count/2);
                outputStream3.write(buff, count/2, count/2);
            }
            else if (count%2!=0){
                outputStream2.write(buff, 0, (count/2)+1);
                outputStream3.write(buff, (count/2)+1, count-((count/2)+1));
            }
        }

        reader.close();
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();

    }
}
