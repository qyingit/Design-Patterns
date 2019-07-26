package com.qying.design.observer.test1;

public class BaiduSite implements Observer {

    private float temperature;
    private float pressure;
    private float humihity;

    public void update(float temperature, float pressure, float humihity){
        this.temperature = temperature;
        this.humihity = humihity;
        this.pressure = pressure;
        display();
    }

    void display(){
        System.out.println("baidu temperature："+temperature);
        System.out.println("baidu pressure:"+pressure);
        System.out.println("baidu humihity:"+humihity);
    }
}
