package com.company.observer.implementation.observer;

import com.company.observer.interfaces.Observer;

public class CurrentInfoWriter implements Observer {

    private String weekDay;
    private int monthDay;
    private int pairsAmount;

    @Override
    public void update(String weekDay, int monthDay, int pairsAmount) {
        this.weekDay = weekDay;
        this.monthDay = monthDay;
        this.pairsAmount = pairsAmount;
        writeInfo();
    }

    private void writeInfo() {
        System.out.println(weekDay);
        System.out.println(monthDay);
        System.out.println(pairsAmount);
    }
}
