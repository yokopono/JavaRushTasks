package com.javarush.task.task13.task1304;

/* 
Selectable и Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public static class Screen implements Selectable,Updatable{
        @Override
        public void onSelect() {
            System.out.println('1');
        }

        @Override
        public void refresh() {
            System.out.println(2);
        }
    }
}
