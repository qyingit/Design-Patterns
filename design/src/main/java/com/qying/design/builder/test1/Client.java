package com.qying.design.builder.test1;

public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);


        House house = houseDirector.constructHouse();
        System.out.println("-------------------");

        HighBuilding highBuilding = new HighBuilding();

        houseDirector.setHouseBuilder(highBuilding);
        houseDirector.constructHouse();
    }
}
