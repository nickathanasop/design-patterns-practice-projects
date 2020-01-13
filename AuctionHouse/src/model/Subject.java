package model;

import java.util.LinkedList;

public class Subject {

    private LinkedList<Observer> observers;

    public Subject() {
        observers = new LinkedList<>();
    }

    public void addObserver(Observer b) {
        if (!observers.contains(b)) {
            observers.add(b);
        }
    }

    public void notifyObservers(Subject observable, double bid) {
        for (Observer observer : observers) {
            observer.update(this, bid);
        }
    }
}
