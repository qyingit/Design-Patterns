package com.qying.design.observer;

public class WeatherData {

    private float temperature;
    private float pressure;
    private float humihity;

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumihity() {
        return humihity;
    }

    void dataChange(){
        currentConditions.update(getTemperature(),getPressure(),getHumihity());
    }

    void setData(float temperature, float pressure, float humihity){
        this.temperature = temperature;
        this.humihity = humihity;
        this.pressure = pressure;
        dataChange();
    }
}
