package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filenameIn = reader.readLine();
        String fileNameOut = reader.readLine();
        FileReader reader1 = new FileReader(filenameIn);
        FileWriter writer = new FileWriter(fileNameOut);
        while (reader1.ready())
        {
            int nextLine = reader1.read();
            if (nextLine == 46) nextLine = 33;
            writer.write(nextLine);
        }
        reader.close();
        reader1.close();
        writer.close();
    }
}
