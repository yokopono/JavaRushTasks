package com.javarush.task.task08.task0819;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator iterator =cats.iterator();
        cats.remove(iterator.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<Cat> ();
        Cat a = new Cat();
        Cat b = new Cat();
        Cat c = new Cat();
        set.add(a);
        set.add(b);
        set.add(c);
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat set:cats) {
            System.out.println(set);
        }
    }

    public static class Cat{

    }
}
