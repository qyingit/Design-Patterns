package com.qying.design.prototype.test2;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p =new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","小谬");

        DeepProtoType p1 = (DeepProtoType)p.clone();
        System.out.println(p.deepCloneableTarget.hashCode());
        System.out.println(p1.deepCloneableTarget.hashCode());

        DeepProtoType p2 = (DeepProtoType)p.deepClone();
        System.out.println(p.deepCloneableTarget.hashCode());
        System.out.println(p2.deepCloneableTarget.hashCode());

    }
}
