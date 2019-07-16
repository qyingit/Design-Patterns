package com.qying.design.prototype;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"白色");

        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());

        System.out.println(sheep);
    }
}
