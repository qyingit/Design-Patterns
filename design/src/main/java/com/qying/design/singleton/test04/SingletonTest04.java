package com.qying.design.singleton.test04;

public class SingletonTest04 {


    //有同步效果，但是加锁太重
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());


    }
}
