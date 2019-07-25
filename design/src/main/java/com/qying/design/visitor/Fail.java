package com.qying.design.visitor;

public class Fail extends Action {
    void getManResult(Man man) {
        System.out.println("男人说失败");
    }

    void getWomanResult(Woman woman) {
        System.out.println("女人说失败");
    }
}
