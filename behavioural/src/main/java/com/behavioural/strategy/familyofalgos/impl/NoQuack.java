package com.behavioural.strategy.familyofalgos.impl;

import com.behavioural.strategy.familyofalgos.IQuack;

public class NoQuack implements IQuack {


    @Override
    public String quack() {
        return new String("no quack sound");
    }
}
