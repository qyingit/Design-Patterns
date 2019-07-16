package com.qying.design.singleton.test07;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){}


    //使用静态内部类保证初始化实例只有一个线程
    //在内装载时不会立即实例化，而是通过getInstance方法，装在SingletonInstance类，完成
    //Singleton的实例化
    //
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public  static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
