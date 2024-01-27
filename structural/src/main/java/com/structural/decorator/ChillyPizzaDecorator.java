package com.structural.decorator;

public class ChillyPizzaDecorator extends PizzaDecorator {
    Pizza pizza;
    ChillyPizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+30;
    }
}
