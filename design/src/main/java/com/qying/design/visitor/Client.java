package com.qying.design.visitor;

public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new  ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        System.out.println("=============");
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("========wait====");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
