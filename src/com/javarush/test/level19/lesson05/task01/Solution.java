package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        FileReader reader1 = new FileReader(firstFile);
        FileWriter writer = new FileWriter(secondFile);
        Boolean flag = false;
        while (reader1.ready()){
            int data = reader1.read();
            if (flag) {
                writer.write(data);
                flag = false;
            }
            else flag=true;
        }
        reader.close();
        reader1.close();
        writer.close();
    }
}
