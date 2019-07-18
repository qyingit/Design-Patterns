package com.qying.design.facade;

public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();
    public static TheaterLight getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("theaterlight on");
    }

    public void off(){
        System.out.println("theaterlight off");
    }

    public void dim() {
        System.out.println("thraterlight dim ");
    }

    public void bright() {
        System.out.println("thraterlight bright");
    }
}
