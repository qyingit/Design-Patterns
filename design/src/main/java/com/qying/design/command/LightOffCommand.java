package com.qying.design.command;

public class LightOffCommand  implements Command{

    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }


    public void execute() {
        lightReceiver.off();
    }

    public void undo() {
        lightReceiver.on();
    }
}
