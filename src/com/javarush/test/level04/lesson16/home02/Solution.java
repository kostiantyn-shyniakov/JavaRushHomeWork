package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n1 = reader.readLine();
        int n11 = Integer.parseInt(n1);
        String n2 = reader.readLine();
        int n22 = Integer.parseInt(n2);  //напишите тут ваш код
        String n3 = reader.readLine();
        int n33 = Integer.parseInt(n3);

        if (n11>n22 && n11<n33) System.out.println(n11);//напишите тут ваш код
        if (n22>n11 && n22<n33) System.out.println(n22);
        if (n33>n22 && n33<n11) System.out.println(n33);
    }
}
