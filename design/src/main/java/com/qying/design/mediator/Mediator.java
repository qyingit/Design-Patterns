package com.qying.design.mediator;


public abstract class Mediator {

   abstract void Register(String collegeName, Colleague colleague);

   abstract void GetMessage(int stateChange, String colleagueName);

   abstract void SendMessage();
}
