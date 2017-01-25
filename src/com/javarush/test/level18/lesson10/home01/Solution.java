package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream file = new FileInputStream(args[0]);
        int count = 0;
        while (file.available()>0){
            int data = file.read();
            if (data > 64 && data <91) count++;
            if (data > 96 && data <123) count++;
        }
        System.out.println(count);
        file.close();
    }
}
