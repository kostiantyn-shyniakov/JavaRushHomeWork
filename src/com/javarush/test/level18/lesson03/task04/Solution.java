package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
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
        int min=Integer.MAX_VALUE;
        while (inputStream.available()>0)
        {
            int data = inputStream.read();
            bytesArray[data]++;
        }

        for(int i=0;i<bytesArray.length;i++)
        {
            if (bytesArray[i]<min && bytesArray[i]>0) min=bytesArray[i];
        }

        for(int i=0;i<bytesArray.length;i++)
        {
            if(bytesArray[i]==min) System.out.print(i+" ");
        }

        reader.close();
        inputStream.close();
    }
}
