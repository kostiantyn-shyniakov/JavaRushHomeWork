package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String fileName = reader.readLine();
        //String[] fileNames = fileName.split(", ");
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outStream2 = new FileOutputStream(reader.readLine());
        int bytesCount=inputStream.available();
        System.out.println(bytesCount);
        int switchBarrier = bytesCount/2;
        System.out.println(switchBarrier);
        while (inputStream.available()>0)
        {
            int data = inputStream.read();
            if (bytesCount > switchBarrier) outStream1.write(data);
            else outStream2.write(data);
            bytesCount--;
        }
        //System.out.println(count);
        reader.close();
        inputStream.close();
        outStream1.close();
        outStream2.close();
    }
}
