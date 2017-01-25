package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код

        char[] masChar = s.toCharArray();

        if (masChar[0]!=' ') masChar[0]=Character.toUpperCase(masChar[0]);
        for (int i=1;i<s.length()-1;i++)
        {

            if ((masChar[i-1]==' ')&&(masChar[i]!=' ')) masChar[i]=Character.toUpperCase(masChar[i]);
        }

        String output=new String(masChar);
        System.out.println(masChar);
    }


}
