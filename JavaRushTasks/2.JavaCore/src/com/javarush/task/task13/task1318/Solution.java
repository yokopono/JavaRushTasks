package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        InputStream inputStream = new FileInputStream(s);
        while (inputStream.available()>0){
            System.out.print((char) inputStream.read());
        }
        System.out.println();
        inputStream.close();
        reader.close();
    }
}