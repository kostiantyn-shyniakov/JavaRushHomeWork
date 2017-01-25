package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введеные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        OutputStream outStream = new FileOutputStream(fileName);
        ArrayList<String> list = new ArrayList<>();

        while (true)
        {
            fileName=reader.readLine();

            list.add(fileName);
            if (fileName.equals("exit")) break;
            //System.out.println(fileName);
        }

        Iterator<String> iterator = list.iterator();//получение итератора для списка

        while (iterator.hasNext())      //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий

            char[] b = iterator.next().toCharArray();
            for (int i=0;i<b.length;i++)
            {
            outStream.write((byte) b[i]);
            }
            if (iterator.hasNext()) outStream.write((byte) '\n');
        }
        outStream.close();
        reader.close();
    }
}
