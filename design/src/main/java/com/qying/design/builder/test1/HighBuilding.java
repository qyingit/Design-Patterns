package com.qying.design.builder.test1;

public class HighBuilding extends HouseBuilder{
    void buildBasic() {
        System.out.println("高楼建造100米");
    }

    void buildWalls() {
        System.out.println("高楼墙20cm" );
    }

    void roofed() {
        System.out.println("高楼屋顶");
    }
}
