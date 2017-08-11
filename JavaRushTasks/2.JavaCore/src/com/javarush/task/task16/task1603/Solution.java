package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
Список и нити
В методе main добавить в статический объект list 5 нитей.
 Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread specialThread = new SpecialThread();
        SpecialThread specialThread2 = new SpecialThread();
        SpecialThread specialThread3 = new SpecialThread();
        SpecialThread specialThread4 = new SpecialThread();
        SpecialThread specialThread5 = new SpecialThread();
        Thread thread = new Thread(specialThread);
        Thread thread2 = new Thread(specialThread2);
        Thread thread3 = new Thread(specialThread3);
        Thread thread4 = new Thread(specialThread4);
        Thread thread5 = new Thread(specialThread5);
        thread.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();
        list.add(thread);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
