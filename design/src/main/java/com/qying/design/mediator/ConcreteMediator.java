package com.qying.design.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator {

    private HashMap<String,Colleague> colleagueHashMap;
    private HashMap<String,String> interMap;

    public ConcreteMediator() {
        colleagueHashMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    @Override
    void Register(String collegeName, Colleague colleague) {
        if (colleague instanceof Alarm){
            interMap.put("Alarm",collegeName);
        }else if (colleague instanceof CoffeeMachine){
            interMap.put("CoffeeMachine",collegeName);
        }else if (colleague instanceof TV){
            interMap.put("TV",collegeName);
        }else if(colleague instanceof Curtains){
            interMap.put("Curtains",collegeName);
        }
    }

    void GetMessage(int stateChange, String colleagueName) {
        if (colleagueHashMap.get(colleagueName) instanceof Alarm){
            if (stateChange == 0){
                ((CoffeeMachine)(colleagueHashMap.get(interMap.get("CoffeeMachine")))).StartCoffee();
                ((TV)(colleagueHashMap.get(interMap.get("TV")))).StartTv();
            }else if (stateChange == 1){
                ((TV)(colleagueHashMap.get(interMap.get("TV")))).StopTv();
            }else if(colleagueHashMap.get(colleagueName) instanceof CoffeeMachine){
                ((Curtains)(colleagueHashMap.get(interMap.get("Curtains")))).UpCurtains();
            }else if(colleagueHashMap.get(colleagueName) instanceof TV){

            }
        }

    }

    @Override
    void SendMessage() {

    }
}
