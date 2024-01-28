package com.behavioural.strategy;

import com.behavioural.strategy.familyofalgos.IFly;
import com.behavioural.strategy.familyofalgos.IQuack;

public class Duck {
    private IFly fly;
    private IQuack quack;

    public Duck(IFly fly, IQuack quack) {
        this.fly = fly;
        this.quack = quack;
    }

    public String fly(){
        return this.fly.fly();
    }

    public String  quack() {
        return this.quack.quack();
    }
}
