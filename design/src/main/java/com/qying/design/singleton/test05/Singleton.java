package com.qying.design.singleton.test05;

public class Singleton {

    private Singleton(){}

    private static Singleton instance;



    public  static Singleton getInstance(){
        if (instance == null){
            synchronized(Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }

}
