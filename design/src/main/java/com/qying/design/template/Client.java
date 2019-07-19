package com.qying.design.template;

public class Client {

    public static void main(String[] args) {
        SoyaMilk readBeanSoyaMilk = new RedBeanSoyaMilk();
        readBeanSoyaMilk.make();

        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();


    }
}
