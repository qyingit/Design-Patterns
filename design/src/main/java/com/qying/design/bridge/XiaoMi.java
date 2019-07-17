package com.qying.design.bridge;

public class XiaoMi implements Brand{

    public void open() {
        System.out.println("xiaomi手机开机");
    }

    public void close() {
        System.out.println("xiaomi手机关机");
    }

    public void call() {
        System.out.println("xiaomi手机打电话");
    }
}
