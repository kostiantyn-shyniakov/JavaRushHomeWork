package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        s = s.substring(s.indexOf((int) '?')+1);
        String[] parameters = s.split("&");
        String[] output;
        for(int i=0;i<parameters.length;i++)
        {
            output=parameters[i].split("=");
            System.out.print(output[0]+" ");
        }
        System.out.println();
        for(int i=0;i<parameters.length;i++)
        {
            output=parameters[i].split("=");
            if (output[0].equals("obj"))
            {
                try
                {
                    alert(Double.parseDouble(output[1]));
                } catch (Exception e){
                    alert(output[1]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
