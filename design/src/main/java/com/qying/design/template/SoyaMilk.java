package com.qying.design.template;

public abstract class SoyaMilk {

    void select(){
        System.out.println("选择黄豆");
    }

    abstract void addCondiments();

    public void make() {

        select();
        addCondiments();
        soak();
        beat();
    }

    void soak(){
        System.out.println("侵泡三小时");
    }

    void beat(){
        System.out.println("打碎");
    }
}
