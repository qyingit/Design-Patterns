package com.qying.design.mediator;

public class Curtains extends Colleague{

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange,this.name);
    }

    public void UpCurtains(){
        System.out.println(" iam holding Up Curtains!");
    }
}
