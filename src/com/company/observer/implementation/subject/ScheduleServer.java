package com.company.observer.implementation.subject;

import com.company.observer.interfaces.Observer;
import com.company.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class ScheduleServer implements Subject {

    private List<Observer> observers;
    private String weekDay;
    private int monthDay;
    private int pairsAmount;

    public ScheduleServer() {
        observers = new ArrayList<>();
    }

    public void setNewInfo(String weekDay, int monthDay, int pairsAmount) {
        this.weekDay = weekDay;
        this.monthDay = monthDay;
        this.pairsAmount = pairsAmount;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weekDay, monthDay, pairsAmount);
        }
    }
}
