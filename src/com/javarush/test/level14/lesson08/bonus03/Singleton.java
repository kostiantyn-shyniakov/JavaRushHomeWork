package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by kshyniakov on 23.11.16.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){};

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
