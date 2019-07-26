package com.qying.design.memento;

public class Originator {

    private String state;
    public void setState(String state) {
        this.state = state;
    }

    public Memento saveMemento() {
        return new Memento(state);
    }

    public String getState() {
        return state;
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
