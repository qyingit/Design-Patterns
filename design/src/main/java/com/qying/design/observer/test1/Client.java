package com.qying.design.observer.test1;

public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();

        BaiduSite baiduSite = new BaiduSite();

        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);
        weatherData.setData(10f,100.f,30.3f);
    }
}
