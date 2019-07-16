package com.qying.design.prototype.test1;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"白色");

        sheep.friend = new Sheep("jack",2,"黑色");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();
        System.out.println("sheep1="+sheep1+"sheep1.friend="+sheep1.friend.hashCode());
        System.out.println("sheep2="+sheep2+"sheep2.friend="+sheep2.friend.hashCode());
        System.out.println("sheep3="+sheep3+"sheep3.friend="+sheep3.friend.hashCode());
        System.out.println("sheep4="+sheep4+"sheep4.friend="+sheep4.friend.hashCode());


    }
}
