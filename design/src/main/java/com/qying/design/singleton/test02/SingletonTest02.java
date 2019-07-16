package com.qying.design.singleton.test02;

public class SingletonTest02 {


    //同样内存浪费
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());


    }
}
