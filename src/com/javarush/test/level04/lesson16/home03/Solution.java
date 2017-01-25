package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        int n11=0;
        while (n11!=-1){
            String n1 = reader.readLine();
            n11 = Integer.parseInt(n1);
            i=i+n11;
        }
        System.out.println(i);//напишите тут ваш код
    }
}
