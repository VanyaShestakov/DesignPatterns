package com.company.decorator.components;

public abstract class Phone {

    protected String decription = "Unknown";

    public String getDescription() {
        return decription;
    }

    public abstract double cost();
}
