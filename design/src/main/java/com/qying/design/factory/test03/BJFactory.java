package com.qying.design.factory.test03;


public class BJFactory implements AbsFactory {

    public Pizza createPizza(String orderType) {
       Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
