package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» — «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("AUGUST 1 1980"));
        map.put("Stallone3", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone4", new Date("DECEMBER 1 1980"));
        map.put("Stallone5", new Date("DECEMBER 2 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("NOVEMBER 1 1980"));
        map.put("Stallone10", new Date("NOVEMBER 1 1980"));
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Date> val =iterator.next();
            int m =val.getValue().getMonth();
            if (m >= 5 & m <= 7) {
                iterator.remove();

        }
        }

    }

    public static void main(String[] args) {
    createMap();
   removeAllSummerPeople(createMap());

    }
}
