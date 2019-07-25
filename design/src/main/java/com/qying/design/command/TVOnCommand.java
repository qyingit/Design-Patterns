package com.qying.design.command;

public class TVOnCommand implements Command{

    TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {
        tv.off();
    }
}
