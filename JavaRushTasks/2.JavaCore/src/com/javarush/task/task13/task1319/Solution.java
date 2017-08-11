package com.javarush.task.task13.task1319;


/* 
Запись в файл с консоли

1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку «exit«.
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(s)));
        String s2="";
        while (true){
            s2=reader.readLine();
           bufferedWriter.write(s2);
           bufferedWriter.newLine();
            if (s2.contains("exit")){break;}
        }
        reader.close();
        bufferedWriter.close();
    }
}
