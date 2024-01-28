package com.behavioural.strategy;

import com.behavioural.strategy.familyofalgos.impl.JetFlying;
import com.behavioural.strategy.familyofalgos.impl.NotFlying;
import com.behavioural.strategy.familyofalgos.impl.SimpleQuack;

public class Client {
    public static void main(String[] args) {

        /*
                Strategy Pattern defines a family of algorithms, encapsulates each of them
                and makes them interchangable. Strategy lets the algos vary independently from the clients taht use it
         */

        Duck mountainDuck = new Duck(new JetFlying(), new SimpleQuack());
        System.out.println("mountainDuck : "+mountainDuck.fly());
        System.out.println("mountainDuck : "+mountainDuck.quack());

        Duck rubberDuck = new Duck( new NotFlying(), new SimpleQuack());
        System.out.println("rubberDuck : "+rubberDuck.fly());
        System.out.println("rubberDuck : "+rubberDuck.quack());

    }
}
