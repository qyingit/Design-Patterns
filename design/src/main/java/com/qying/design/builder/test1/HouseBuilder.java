package com.qying.design.builder.test1;

public abstract class HouseBuilder {

    protected House house = new House();

    abstract void buildBasic();

    abstract void buildWalls();

    abstract void roofed();

    public House buildHouse(){
        return house;
    }
}
