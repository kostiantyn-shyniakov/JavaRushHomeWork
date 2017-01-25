package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        int[] a = new int[20];
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Инициализируйте (создайте и заполните) массив тут
        for (int i=0;i<20;i++){
            s=reader.readLine();
            if (s!=null) a[i]=Integer.parseInt(s);
        }
        return a;
    }

    public static int max(int[] array) {
        int b = array[0];
        for (int i=1;i<array.length;i++){
        if (array[i]>b) b=array[i]; //Найдите максимальное значение в этом методе
        }
        return b;
    }
}
