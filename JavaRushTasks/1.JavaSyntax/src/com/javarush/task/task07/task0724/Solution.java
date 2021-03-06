package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
  Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFa1 = new Human("Виталий", true, 71);
        Human grandFa2 = new Human("Сергей", true, 70);
        Human grandMa1 = new Human("Анна", false, 65);
        Human grandMa2 = new Human("Екатерина", false, 64);
        Human father = new Human("Владимир", true, 40, grandFa1, grandMa1 );
        Human mother = new Human("Вика", false, 43, grandFa2, grandMa2);
        Human san1 = new Human("Петя", true, 15, father, mother);
        Human san2 = new Human("Стас", true, 16, father, mother);
        Human daughter = new Human("Оля", false, 10, father, mother);

        System.out.println(grandFa1);
        System.out.println(grandFa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(san1);
        System.out.println(san2);
        System.out.println(daughter);
    }

    public static class Human {
        String name;
        int age;
        boolean sex;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex,int age, Human father, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















