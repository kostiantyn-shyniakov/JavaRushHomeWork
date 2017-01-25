package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] bytesArray = new int[256];
        int max=0;
        while (inputStream.available()>0)
        {
            int data = inputStream.read();
            bytesArray[data]++;
        }

        for(int i=0;i<bytesArray.length;i++)
        {
            if (bytesArray[i]>max) max=bytesArray[i];
        }

        for(int i=0;i<bytesArray.length;i++)
        {
            if(bytesArray[i]==max) System.out.print(i+" ");
        }

        reader.close();
        inputStream.close();
    }
}
