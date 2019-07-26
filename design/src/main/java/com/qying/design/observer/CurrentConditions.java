package com.qying.design.observer;

public class CurrentConditions {
    private float temperature;
    private float pressure;
    private float humihity;

    void update(float temperature, float pressure, float humihity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humihity = humihity;
        display();
    }

    void display(){
        System.out.println("temperature："+temperature);
        System.out.println("pressure:"+pressure);
        System.out.println("humihity:"+humihity);
    }


}
