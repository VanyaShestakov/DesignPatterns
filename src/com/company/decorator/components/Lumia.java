package com.company.decorator.components;

public class Lumia extends Phone {

    public Lumia() {
        decription = "Lumia";
    }

    @Override
    public double cost() {
        return 500;
    }
}
