package com.qying.design.adapter.test1;

public class Client {

    public static void main(String[] args) {
        System.out.println("适配器");

        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
