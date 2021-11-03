package com.company.decorator.decorators;

import com.company.decorator.components.Phone;

public abstract class AccessoryDecorator extends Phone {

    @Override
    public abstract String getDescription();

}
