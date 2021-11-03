package com.company.decorator.components;

public class Iphone extends Phone{

    public Iphone() {
        decription = "Iphone";
    }

    @Override
    public double cost() {
        return 1000;
    }
}
