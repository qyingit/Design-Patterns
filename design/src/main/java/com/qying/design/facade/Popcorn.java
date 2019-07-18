package com.qying.design.facade;

public class Popcorn {

    private static Popcorn instance = new Popcorn();
    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void pop() {
        System.out.println("popcorn pop");
    }

    public void off(){
        System.out.println("popcorn off");
    }

}
