package com.qying.design.command;

public class TVOffCommand implements Command{
    TVReceiver tv;

    public TVOffCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
    }
}
