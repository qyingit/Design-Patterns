package com.qying.design.memento;

public class Client {
    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1 攻击100");
        caretaker.add(originator.saveMemento());
        originator.setState("状态2 攻击80");
        caretaker.add(originator.saveMemento());
        System.out.println("当前状态"+originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("当前状态"+originator.getState());

    }
}
