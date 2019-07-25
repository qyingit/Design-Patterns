package com.qying.design.visitor;

public class Wait extends Action{
    void getManResult(Man man) {
        System.out.println("男人说成功");
    }

    void getWomanResult(Woman woman) {
        System.out.println("女人说成功");
    }
}
