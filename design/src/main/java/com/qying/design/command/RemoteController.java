package com.qying.design.command;

public class RemoteController {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteController() {

        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i =0 ;i<5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }


    void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    void onButtonWasPushed(int no){
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
