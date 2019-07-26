package com.qying.design.observer;

public class Client {
    //error
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();

        WeatherData weatherData = new WeatherData(currentConditions);

        weatherData.setData(30,150,40);
        System.out.println("天气变化情况");
        weatherData.setData(40,160,20);
    }
}
