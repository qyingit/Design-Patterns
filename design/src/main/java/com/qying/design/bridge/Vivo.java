package com.qying.design.bridge;

public class Vivo implements Brand {
    public void open() {
        System.out.println("vivo手机开机");
    }

    public void close() {
        System.out.println("vivo手机关机");
    }

    public void call() {
        System.out.println("vivo手机打电话");
    }
}
