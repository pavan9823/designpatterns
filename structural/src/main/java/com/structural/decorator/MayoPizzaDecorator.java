package com.structural.decorator;

public class MayoPizzaDecorator extends PizzaDecorator{
    Pizza pizza;
    MayoPizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+60;
    }
}
