package com.qying.design.mediator;

public class Alarm extends Colleague {

    public Alarm(Mediator mediator , String name) {
        super(mediator,name);
        mediator.Register(name,this);
    }

    public void SendAlarm(int stateChange){
        SendMessage(stateChange);
    }

    public void SendMessage(int stateChange){
        this.GetMediator().GetMessage(stateChange,this.name);
    }
}
