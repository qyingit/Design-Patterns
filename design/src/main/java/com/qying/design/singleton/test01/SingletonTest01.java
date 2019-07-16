package com.qying.design.singleton.test01;

public class SingletonTest01 {

    //饿汉式  在类装载的时候完成初始化，避免线程同步问题
    //缺点:容易造成内存浪费，不能达到lazy Loading效果
    //通过classloader避免多线程同步问题
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());


    }
}
