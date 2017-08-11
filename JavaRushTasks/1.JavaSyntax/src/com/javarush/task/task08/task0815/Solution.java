package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» — «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Фамилия" + i, "Имя" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (value.equals(name))
                i++;

        }
        return i;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key.equals(lastName))
                i++;

        }
        return i;

    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
      getCountTheSameFirstName(map, "Имя2");
       getCountTheSameLastName(map, "Фамилия2");
    }
}
