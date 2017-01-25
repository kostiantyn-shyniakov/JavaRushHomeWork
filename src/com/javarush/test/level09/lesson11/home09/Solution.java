package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Cat11", new Cat("Cat1"));
        map.put("Cat22", new Cat("Cat2"));
        map.put("Cat33", new Cat("Cat3"));
        map.put("Cat44", new Cat("Cat4"));
        map.put("Cat55", new Cat("Cat5"));
        map.put("Cat66", new Cat("Cat6"));
        map.put("Cat77", new Cat("Cat7"));
        map.put("Cat88", new Cat("Cat8"));//напишите тут ваш код
        map.put("Cat99", new Cat("Cat9"));
        map.put("Cat00", new Cat("Cat0"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();
        Iterator<Map.Entry<String, Cat>> map1 = map.entrySet().iterator();

        for (Map.Entry<String, Cat> stringCatEntry : map.entrySet()) {
            set.add(stringCatEntry.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
