package com.qying.design.decorator.test1;

public class Decorator  extends Drink{
    public Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    float cost() {
        return price + drink.cost();
    }

    public String getDes(){
        return des +"&&"+drink.getDes();
    }
}
