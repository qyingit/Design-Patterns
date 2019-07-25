package com.qying.design.command;

public class Client {

    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommond = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0,lightOnCommand,lightOffCommond);

        System.out.println("-------开灯------");

        remoteController.onButtonWasPushed(0);

        System.out.println("------关灯------");
        remoteController.offButtonWasPushed(0);

        System.out.println("----撤销按钮-----");
        remoteController.undoButtonWasPushed();

        TVReceiver tvReceiver = new TVReceiver();
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        remoteController.setCommand(1,tvOnCommand,tvOffCommand);
        System.out.println("-------开灯------");

        remoteController.onButtonWasPushed(1);

        System.out.println("------关灯------");
        remoteController.offButtonWasPushed(1);

        System.out.println("----撤销按钮-----");
        remoteController.undoButtonWasPushed();
    }
}
