package com.qying.design.singleton.test08;

public enum Singleton {

    //通过枚举实现单利模式，能避免多线程同步问题
    // ，而且还能防止反序列化重新创建新的对象

    INSTANCE;

    public void sayOK(){
        System.out.println("ok--");
    }
}
