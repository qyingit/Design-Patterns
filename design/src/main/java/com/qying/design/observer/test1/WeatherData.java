package com.qying.design.observer.test1;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humihity;

    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
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
        notifyObservers();
    }

    void setData(float temperature, float pressure, float humihity){
        this.temperature = temperature;
        this.humihity = humihity;
        this.pressure = pressure;
        dataChange();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(this.temperature,this.pressure,this.humihity);
        }
    }
}
