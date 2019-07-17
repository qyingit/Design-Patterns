package com.qying.design.decorator.test1;

public class Client {

    public static void main(String[] args) {
        Drink drink = new LongCoffee();
        drink = new Milk(drink);
        System.out.println(drink.getDes());
        System.out.println(drink.cost());
        drink = new Milk(drink);
        System.out.println(drink.getDes());
        System.out.println(drink.cost());
    }
}
