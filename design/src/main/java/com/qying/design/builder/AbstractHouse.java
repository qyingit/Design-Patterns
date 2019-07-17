package com.qying.design.builder;

public abstract class AbstractHouse {

    //传统比较好理解，简单操作
    //设计程序简单，没有设计缓存曾对象，程序扩展和维护不好
    // ，把产品与创建过程耦合在一起，耦合性

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
