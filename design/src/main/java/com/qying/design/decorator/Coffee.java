package com.qying.design.decorator;

public class Coffee extends Drink{
    public float cost(){
        return super.getPrice();
    }
}
