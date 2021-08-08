package DesignPattern.behavioral.ObserverPattern;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    float temp, humidity;
    Observable observable;

    public ThirdPartyDisplay(Observable observable){
        this.observable = observable;
        this.observable.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("ThirdPartyDisplay");
        System.out.println("Temp: " + temp + "\nHumidity: " + humidity+"\n");
    }

    @Override
    public void update(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
