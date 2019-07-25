package com.qying.design.command;

public class LightOnCommand implements Command{
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }

    public void execute() {
        lightReceiver.on();
    }

    public void undo() {
        lightReceiver.off();
    }
}
