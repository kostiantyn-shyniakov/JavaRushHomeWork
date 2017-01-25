package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread task = new SpecialThread();
        list.add(new Thread(task));
        SpecialThread task2 = new SpecialThread();
        list.add(new Thread(task2));
        SpecialThread task3 = new SpecialThread();
        list.add(new Thread(task3));
        SpecialThread task4 = new SpecialThread();
        list.add(new Thread(task4));
        SpecialThread task5 = new SpecialThread();
        list.add(new Thread(task5));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
