package com.qying.design.mediator;

public class CoffeeMachine extends Colleague{

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange,this.name);
    }

    public void StartCoffee(){
        System.out.println("time to startCoffe");
    }

    public void FinishCoffee(){
        System.out.println("After 5 minutes");
        System.out.println("COFFEE IT OK");
        SendMessage(0);
    }
}
