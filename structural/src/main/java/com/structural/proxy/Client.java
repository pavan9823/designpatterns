package com.structural.proxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        ATM atm = new ATM();
        atm.draw("user","pwd");

    }
}
