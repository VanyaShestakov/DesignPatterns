package com.company.observer.interfaces;

import com.company.observer.interfaces.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();


}
