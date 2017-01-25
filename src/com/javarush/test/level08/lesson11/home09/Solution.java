package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {

        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        String[] incomingDate=date.split(" ");
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        yearStartTime.setYear(Integer.parseInt(incomingDate[2]));
        Date analyzingTime = new Date();
        analyzingTime.setHours(0);
        analyzingTime.setMinutes(0);
        analyzingTime.setSeconds(0);
        analyzingTime.setDate(Integer.parseInt(incomingDate[1]));
        switch (incomingDate[0]) {
            case "JANUARY":  analyzingTime.setMonth(0);
                break;
            case "FEBRUARY":  analyzingTime.setMonth(1);
                break;
            case "MARCH":  analyzingTime.setMonth(2);
                break;
            case "APRIL":  analyzingTime.setMonth(3);
                break;
            case "MAY":  analyzingTime.setMonth(4);
                break;
            case "JUNE":  analyzingTime.setMonth(5);
                break;
            case "JULY":  analyzingTime.setMonth(6);
                break;
            case "AUGUST":  analyzingTime.setMonth(7);
                break;
            case "SEPTEMBER":  analyzingTime.setMonth(8);
                break;
            case "OCTOBER": analyzingTime.setMonth(9);
                break;
            case "NOVEMBER": analyzingTime.setMonth(10);
                break;
            case "DECEMBER": analyzingTime.setMonth(11);
                break;

        }

        analyzingTime.setYear(Integer.parseInt(incomingDate[2]));
        long time = (analyzingTime.getTime()-yearStartTime.getTime())/86400000;
        return (time % 2)==0?true:false;
    }
}
