package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String a;
        boolean b;
        int i;
        Human h;
        double d;
        char c;

        Human(String a){
            this.a=a;
        }
        Human(boolean b){
            this.b=b;
        }
        Human(int i){
            this.i=i;
        }
        Human(Human h){
            this.h=h;
        }
        Human(double d){
            this.d=d;
        }//напишите тут ваши переменные и конструкторы
        Human(char c){
            this.c=c;
        }
        Human(boolean b,int i){
            this.b=b;
            this.i=i;
        }
        Human(String a, boolean b){
            this.a=a;
            this.b=b;
        }
        Human(char c, boolean b){
            this.c=c;
            this.b=b;

        }
        Human(Human h, boolean b){
            this.h=h;
            this.b=b;
        }
    }
}
