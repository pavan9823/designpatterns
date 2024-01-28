package com.behavioural.strategy.familyofalgos.impl;

import com.behavioural.strategy.familyofalgos.IFly;

public class JetFlying implements IFly {

    @Override
    public String fly() {
        return new String("Jet Flying");
    }
}
