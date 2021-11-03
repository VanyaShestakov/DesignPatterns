package com.company.decorator.decorators;

import com.company.decorator.components.Phone;

public class Cover extends AccessoryDecorator {

    private Phone phone;

    public Cover(Phone phone) {
        this.phone = phone;
    }

    @Override
    public double cost() {
        return 10 + phone.cost();
    }

    @Override
    public String getDescription() {
        return phone.getDescription() + ", Cover";
    }
}
