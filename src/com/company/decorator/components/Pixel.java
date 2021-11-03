package com.company.decorator.components;

public class Pixel extends Phone {

    public Pixel() {
        decription = "Pixel";
    }

    @Override
    public double cost() {
        return 800;
    }

}
