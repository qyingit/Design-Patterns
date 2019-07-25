package com.qying.design.visitor;

public class Woman extends Person {
    void accept(Action action) {
        action.getWomanResult(this);
    }
}
