package com.qying.design.visitor;

public class Man extends Person {
    void accept(Action action) {
        action.getManResult(this);
    }
}
