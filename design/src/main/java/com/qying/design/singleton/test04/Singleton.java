package com.qying.design.singleton.test04;

public class Singleton {

    private Singleton(){}

    private static Singleton instance;



    public synchronized static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
