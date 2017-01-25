package com.javarush.test.level06.lesson05.task02;

/* Классы Cat и Dog и метод finalize для каждого
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
*/

public class Cat
{
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    } //напишите тут ваш код

}

class Dog
{
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    } //напишите тут ваш код

}