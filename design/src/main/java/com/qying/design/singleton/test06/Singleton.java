package com.qying.design.singleton.test06;

public class Singleton {

    private Singleton(){}

    private static Singleton instance;


    //双端检查机制，进行两次对对象为空判断保证线程安全性
    //实例化代码执行一次后面再次访问直接return避免线程同步，延迟加载效率高

    public  static Singleton getInstance(){
        if (instance == null){
            synchronized(Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
