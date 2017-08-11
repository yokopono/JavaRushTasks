package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws CorruptedDataException {
        String name1 = null;
        String name2 = null;
        try {
            name1 = reader.readLine();
            name2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            allLines = Files.readAllLines(Paths.get(name1));
            forRemoveLines = Files.readAllLines(Paths.get(name2));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if
                (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
