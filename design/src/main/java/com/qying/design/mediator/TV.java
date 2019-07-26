package com.qying.design.mediator;

public class TV extends Colleague{

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange,this.name);
    }

    public void StartTv(){
        System.out.println("it time to start tv");
    }

    public void StopTv(){
        System.out.println(" it s time to stop tv");
    }
}
