package com.javarush.test.level14.lesson06.home01;

/**
 * Created by kshyniakov on 22.11.16.
 */
public class MoldovanHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 6;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
