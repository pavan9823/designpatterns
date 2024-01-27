package com.structural.decorator;

public class Client {


    public static void main(String[] args) {
        Pizza maidaPizza = new MaidaPizza();
        System.out.println("maidaPizza : "+maidaPizza.cost());


        Pizza maidaPizzaWithMayoTopping = new MayoPizzaDecorator(new MaidaPizza());
        System.out.println("maidaPizzaWithMayoTopping : "+maidaPizzaWithMayoTopping.cost());

        Pizza maidaPizzaWithMayoAndChillyTopping = new ChillyPizzaDecorator(new MayoPizzaDecorator( new MaidaPizza()));
        System.out.println("maidaPizzaWithMayoAndChillyTopping : "+maidaPizzaWithMayoAndChillyTopping.cost());



    }


}
