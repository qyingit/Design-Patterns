package com.qying.design.decorator.test1;

public abstract class Drink {

    public String des;

    public float price = 0.0f;

    abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price ;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
