package com.javarush.task.task17.task1710;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        switch (args[0]) {
            case "-i": {
                int i = Integer.parseInt(args[1]);
                info(i);
                break;
            }
            case "-d": {
                int i = Integer.parseInt(args[1]);
                del(i);
                break;
            }
            case "-c":{
                SimpleDateFormat formDateIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Date d=formDateIn.parse(args[3]);
                switch (args[2]){
                    case "м":{
                        allPeople.add(Person.createMale(args[1],d));
                        System.out.println(allPeople.size()-1);
                        break;
                    }
                    case "ж":{
                        allPeople.add(Person.createFemale(args[1],d));
                        System.out.println(allPeople.size()-1);
                        break;
                    }
                }
            } break;
            case "-u":{
                SimpleDateFormat formDateIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Date d=formDateIn.parse(args[4]);
                for (int i = 0; i < allPeople.size(); i++) {
                    int l =Integer.parseInt(args[1]);
                    if (l==i) {
                        allPeople.get(i).setBirthDay(d);
                        allPeople.get(i).setName(args[2]);
                        switch (args[3]){
                            case "м":{
                                allPeople.get(i).setSex(Sex.MALE);
                                break;
                            }
                            case "ж":{
                                allPeople.get(i).setSex(Sex.FEMALE);
                                break;
                            }
                        }
                        break;
                    }
                }

            }break;
        }
    }


    public static void info(int index) {
        for (int i = 0; i < allPeople.size(); i++) {
            if (i == index) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                switch (allPeople.get(i).getSex()) {
                    case FEMALE:
                        System.out.println(allPeople.get(i).getName() + " ж" + " " + simpleDateFormat.format(allPeople.get(i).getBirthDay()));
                        break;
                    case MALE:
                        System.out.println(allPeople.get(i).getName() + " м" + " " + simpleDateFormat.format(allPeople.get(i).getBirthDay()));
                        break;
                }
            }
        }
    }

    public static void del(int index) {
        for (int i = 0; i < allPeople.size(); i++) {
            if (i == index) {
                allPeople.get(i).setBirthDay(null);
                allPeople.get(i).setName(null);
                allPeople.get(i).setSex(null);
                break;
            }
        }
    }
}
