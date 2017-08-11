package com.javarush.task.task14.task1421;

/**
 * Created by solovev.grigoriy on 12.04.2017.
 */
public class Singleton {
    static private Singleton instance=new Singleton();

     private Singleton() {
    }

    public static Singleton getInstance(){
        return instance;
    }
}
