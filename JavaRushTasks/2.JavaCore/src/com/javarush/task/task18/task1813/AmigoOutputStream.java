package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    FileOutputStream fileOutputStream;

    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(FileOutputStream name) throws FileNotFoundException {
        super(fileName);
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);

    }

    @Override
    public void close() throws IOException {
        fileOutputStream.flush();
        String s1 = "JavaRush © All rights reserved.";
        fileOutputStream.write(s1.getBytes());
        fileOutputStream.close();
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();

    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
