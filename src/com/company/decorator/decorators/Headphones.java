package com.company.decorator.decorators;

import com.company.decorator.components.Phone;

public class Headphones extends AccessoryDecorator{

    private Phone phone;

    public Headphones(Phone phone) {
        this.phone = phone;
    }

    @Override
    public double cost() {
        return 100 + phone.cost();
    }

    @Override
    public String getDescription() {
        return phone.getDescription() + ", Headphones";
    }
}
