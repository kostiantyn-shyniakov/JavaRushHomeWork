package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n1 = reader.readLine();
        int n11 = Integer.parseInt(n1);
        String n2 = reader.readLine();
        int n22 = Integer.parseInt(n2);  //напишите тут ваш код
        String n3 = reader.readLine();
        int n33 = Integer.parseInt(n3);
        int neg=0;
        int pos=0;
        if (n11>=0) pos++;
        else neg++;
        if (n22>=0) pos++;
        else neg++;
        if (n33>=0) pos++;
        else neg++;//напишите тут ваш код
        System.out.println("количество отрицательных чисел: "+pos);
        System.out.println("количество положительных чисел: "+neg);
    }
}
