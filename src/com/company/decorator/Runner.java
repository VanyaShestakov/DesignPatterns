package com.company.decorator;

import com.company.decorator.components.Iphone;
import com.company.decorator.components.Phone;
import com.company.decorator.decorators.Cover;
import com.company.decorator.decorators.Headphones;

public class Runner {
    public static void main(String[] args) {
        Phone iphone = new Iphone();
        iphone = new Cover(iphone);
        iphone = new Headphones(iphone);
        System.out.println(iphone.getDescription());
        System.out.println(iphone.cost());
    }
}
