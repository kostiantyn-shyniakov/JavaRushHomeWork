package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        removeAllSummerPeople(createMap());

    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallon", new Date("JULY 1 1980"));
        map.put("Stallo", new Date("AUGUST 1 1980"));
        map.put("Stall", new Date("SEPTEMBER 1 1980"));
        map.put("Stal", new Date("MAY 1 1980"));
        map.put("Stae", new Date("MARCH 1 1980"));
        map.put("Stane", new Date("JUNE 2 1980"));
        map.put("Sta", new Date("JUNE 3 1980"));
        map.put("Ste", new Date("JUNE 4 1980"));
        map.put("Sllone", new Date("JANUARY 5 1980"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            int i = date.getMonth();
            System.out.println(i);
            if (i==5 || i==6 || i==7) iterator.remove();
        }
        for (Map.Entry<String, Date> pair1 : map.entrySet())
        {
            String key = pair1.getKey();                      //ключ
            Date value = pair1.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
    }
}
