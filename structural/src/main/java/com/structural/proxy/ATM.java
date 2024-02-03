package com.structural.proxy;

public class ATM {
    private Bank bank;

    public void draw(String username, String password) throws InterruptedException {
        bank = new Bank();
        //validations
        System.out.println("validating credentials");
        Thread.sleep(2000);
        bank.draw();
    }
}
