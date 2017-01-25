package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
       Human gp1 = new Human("GP1",true,78,null,null); //напишите тут ваш код
       Human gp2 = new Human("GP2",true,67,null,null);
       Human gm1 = new Human("GM1",false,77,null,null);
       Human gm2 = new Human("GM2",false,66,null,null);
       Human papa = new Human("father",true,55,gp2,gm2);
       Human mama = new Human("mother",false,44,gp1,gm1);
       Human child1 = new Human("child1",true,7,papa,mama);
       Human child2 = new Human("child2",false,8,papa,mama);
       Human child3 = new Human("child3",true,11,papa,mama);
        System.out.println(gp1);
        System.out.println(gp2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;//напишите тут ваш код

        Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
