package com.qying.design.mediator;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Alarm alarm = new Alarm(mediator,"alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,"coffeeMachine");

        Curtains curtains = new Curtains(mediator,"curtains");

        TV tv = new TV(mediator,"TV");

        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.SendAlarm(1);
    }
}
