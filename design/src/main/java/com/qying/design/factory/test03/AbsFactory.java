package com.qying.design.factory.test03;

public interface AbsFactory {
    //抽象工厂模式，即将工厂的创建方法进行抽象化，可以演化为各种工厂
    //创建对象的时候不应该直接的new，应该放到一个工厂的方法中
    //不要让类继承类，而实继承抽象类或者实现
    //不要覆盖类中已经实现的方法
    Pizza createPizza(String orderType);
}
