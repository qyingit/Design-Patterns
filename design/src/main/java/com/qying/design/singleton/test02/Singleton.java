package com.qying.design.singleton.test02;

public class Singleton {

    private Singleton(){}

    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return singleton;
    }

}
