package DesignPattern;


import DesignPattern.behavioral.ObserverPattern.ForecastDisplay;
import DesignPattern.behavioral.ObserverPattern.StatisticsDisplay;
import DesignPattern.behavioral.ObserverPattern.ThirdPartyDisplay;
import DesignPattern.behavioral.ObserverPattern.WeatherData;

public class Main {

    public static void main(String[] args) {
        var weatherData = new WeatherData();
        var thirdPartyDisplay = new ThirdPartyDisplay(weatherData);
        var statisticDisplay = new StatisticsDisplay(weatherData);
        var forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurement(15,35);
        weatherData.setMeasurement(25,40);
    }
}
