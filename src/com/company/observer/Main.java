package com.company.observer;

import com.company.observer.implementation.observer.CurrentInfoWriter;
import com.company.observer.implementation.subject.ScheduleServer;
import com.company.observer.interfaces.Observer;

public class Main {

    public static void main(String[] args) {
        ScheduleServer server = new ScheduleServer();

        Observer obs1 = new CurrentInfoWriter();
        Observer obs2 = new CurrentInfoWriter();

        server.registerObserver(obs1);
        server.registerObserver(obs2);
        server.registerObserver((weekDay, monthDay, pairsAmount) -> {
            System.out.println(weekDay);
        });

        server.setNewInfo("Monday", 10, 4);

        server.removeObserver(obs1);

        server.setNewInfo("Tuesday", 11, 3);
    }
}
