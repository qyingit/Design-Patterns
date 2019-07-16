package com.qying.design.singleton.test03;


public class SingletonTest03 {


    //有lazyloading效果，但是只能单线程使用
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());


    }
}
