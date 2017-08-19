package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] s = fileScanner.nextLine().split(" ");
            String secondName = s[0];
            String lastName = s[1];
            String firstName = s[2];
            String date = s[3] + s[4] + s[5];
            Date date1 = new Date(date);

            return new Person(firstName, secondName, lastName, date1);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
