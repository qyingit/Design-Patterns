package com.qying.design.proxy.test2;

public class Client {

    public static void main(String[] args) {
        TeachDao target = new TeachDao();
        TeachDao proxy = (TeachDao)new ProxyFactory(target).getProxyInstance();

        String res = proxy.teach();
        System.out.println("res= "+ res);

    }
}
