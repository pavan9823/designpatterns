package com.structural.adapter;

public class Client {

    public static void main(String[] args) {
        Target target = new Adapter(new AdapteeImpl());
        target.request();
    }

}
