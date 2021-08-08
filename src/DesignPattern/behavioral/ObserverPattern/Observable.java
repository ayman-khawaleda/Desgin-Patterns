package DesignPattern.behavioral.ObserverPattern;

public interface Observable {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void setChange();

    void notifyObservers();
}
