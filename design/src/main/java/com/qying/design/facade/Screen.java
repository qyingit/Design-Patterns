package com.qying.design.facade;

public class Screen {

    private static Screen insatnce = new Screen();
    public static Screen getInstance() {
        return insatnce;
    }

    public void down() {
        System.out.println("screen down");
    }

    public void up() {
        System.out.println("screen up");
    }
}
