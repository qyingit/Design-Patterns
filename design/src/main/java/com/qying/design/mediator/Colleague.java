package com.qying.design.mediator;

public abstract class Colleague {

    public Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator GetMediator(){
        return this.mediator;
    }

    abstract void SendMessage(int stateChange);
}
