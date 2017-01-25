package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/
import java.util.Random;
public class Cat
{
    protected String name;
    protected int age;
    protected int weight;
    protected int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat)
    {
        int score1=0;
        int score2=0;
        if (this.age > anotherCat.age) score1=score1+1;
        else score2=score2+1;
        if (this.weight > anotherCat.weight) score1=score1+2;
        else score2=score2+2;
        if (this.strength > anotherCat.strength) score1=score1+4;
        else score2=score2+4;

        return score1 > score2; //напишите тут ваш код

    }
}
