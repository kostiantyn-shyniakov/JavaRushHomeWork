package com.javarush.test.level14.lesson06.home01;

/**
 * Created by kshyniakov on 22.11.16.
 */
public class UkrainianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 5;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
