package com.behavioural.strategy.familyofalgos.impl;

import com.behavioural.strategy.familyofalgos.IFly;

public class NotFlying implements IFly {

    @Override
    public String fly() {
        return new String("Not Flying");

    }
}
