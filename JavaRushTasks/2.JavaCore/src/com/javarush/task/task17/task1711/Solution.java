package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-i": {

                synchronized (allPeople) {
                    int i1;
                    for (int i = 1; i < args.length; i++) {
                        i1 = Integer.parseInt(args[i]);
                        info(i1);
                    }

                    break;
                }
            }
            case "-d": {
                synchronized (allPeople) {
                    int i1;
                    for (int i = 1; i < args.length; i++) {
                        i1 = Integer.parseInt(args[i]);
                        del(i1);
                    }
                }
                break;
            }
            case "-c": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м"))
                            allPeople.add(Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                        else if (args[i + 1].equals("ж"))
                            allPeople.add(Person.createFemale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            }
            case "-u": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        try {
                            int id = Integer.parseInt(args[i]);
                            if (id > allPeople.size() - 1) {
                                break;
                            }
                            String name = args[i + 1];
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                            Date bd = simpleDateFormat.parse(args[i + 3]);
                            if (args[i + 2].equals("м")) {
                                Person p = Person.createMale(name, bd);
                                allPeople.set(id, p);
                            } else if (args[i + 2].equals("ж")) {
                                Person p = Person.createFemale(name, bd);
                                allPeople.set(id, p);
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                }
            }
        }
    }


    public static void info(int index) {
        synchronized (allPeople) {
            for (int i = 0; i < allPeople.size(); i++) {
                if (i == index) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    switch (allPeople.get(i).getSex()) {
                        case FEMALE:
                            synchronized (allPeople) {
                                System.out.println(allPeople.get(i).getName() + " ж" + " " + simpleDateFormat.format(allPeople.get(i).getBirthDay()));
                            }
                            break;
                        case MALE:
                            synchronized (allPeople) {
                                System.out.println(allPeople.get(i).getName() + " м" + " " + simpleDateFormat.format(allPeople.get(i).getBirthDay()));
                            }
                            break;
                    }
                }
            }
        }
    }

    public static void del(int index) {
        synchronized (allPeople) {
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
}
