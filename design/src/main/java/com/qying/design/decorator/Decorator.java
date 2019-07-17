package com.qying.design.decorator;

public class Decorator extends Drink{
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    public float cost(){
        return super.getPrice() + obj.cost();
    }

    public String getDes(){
        return des+""+getPrice()+"&&"+obj.getDes();
    }
}
