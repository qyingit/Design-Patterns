package com.qying.design.factory.test1;

public class Pizza {

    public void prepare(){}

    public void bake(){}

    public void cut(){}

    public void box(){}

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
