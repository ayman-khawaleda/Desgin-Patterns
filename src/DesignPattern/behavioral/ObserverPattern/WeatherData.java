package DesignPattern.behavioral.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
    List<Observer> observers;
    boolean isChange = false;
    private float temp, humidity;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        var i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void setChange() {
        isChange = true;
    }

    @Override
    public void notifyObservers() {
        if (isChange) {
            for (var observer : observers) {
                observer.update(temp, humidity);
            }
            isChange = false;
        }
    }

    public void setMeasurement(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        isChange=true;
        notifyObservers();
    }
}
