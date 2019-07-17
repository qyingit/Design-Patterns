package com.qying.design.builder.test1;

public class CommonHouse extends HouseBuilder {
    void buildBasic() {
        System.out.println("普通房子建造");
    }

    void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    void roofed() {
        System.out.println("普通房子屋顶");
    }
}
