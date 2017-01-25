package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        System.out.println("количество отрицательных чисел: "+neg);
        System.out.println("количество положительных чисел: "+pos);//напишите тут ваш код

    }
}
