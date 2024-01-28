package com.behavioural.strategy.familyofalgos.impl;

import com.behavioural.strategy.familyofalgos.IQuack;

public class SimpleQuack implements IQuack {


    @Override
    public String quack() {
        return new String("quack... quack");
    }
}
