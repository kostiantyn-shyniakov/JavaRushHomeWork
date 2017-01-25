package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), StandardCharsets.UTF_8));
        String line;
        int count = 0;
        while (fileReader.ready())
        {
            line = fileReader.readLine();
            line = line.toLowerCase();
            line = line.replaceAll("\\p{P}", " ");
            String[] words = line.split(" ");
            for(String word : words){
                if (word.equals("world")) count++;
            }
        }
        System.out.println(count);
        reader.close();
        fileReader.close();
    }
}
