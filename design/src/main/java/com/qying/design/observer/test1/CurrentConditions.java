package com.qying.design.observer.test1;

public class CurrentConditions implements Observer{
    private float temperature;
    private float pressure;
    private float humihity;

    public void update(float temperature, float pressure, float humihity){
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
