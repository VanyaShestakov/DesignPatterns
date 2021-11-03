package com.company.decorator.decorators;

import com.company.decorator.components.Phone;

public class Charger extends AccessoryDecorator{

    private Phone phone;

    public Charger(Phone phone) {
        this.phone = phone;
    }

    @Override
    public double cost() {
        return 30 + phone.cost();
    }

    @Override
    public String getDescription() {
        return phone.getDescription() + ", charger";
    }
}
