package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outStream1 = new FileOutputStream(reader.readLine());
        byte[] buff=new byte[inputStream.available()];
        //System.out.println(bytesCount);
        inputStream.read(buff);
        for (int i=buff.length-1;i>=0;i--){
            outStream1.write(buff[i]);
        }
        //System.out.println(count);
        reader.close();
        inputStream.close();
        outStream1.close();
    }
}
