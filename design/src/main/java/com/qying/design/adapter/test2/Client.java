package com.qying.design.adapter.test2;

public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("m1方法实现");
            }
        };
        absAdapter.m1();
    }
}
