package com.javarush.test.level06.lesson05.task01;

/* Метод finalize класса Cat
В классе Cat создать метод protected void finalize() throws Throwable
*/

public class Cat
{
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    } //напишите тут ваш код

}

