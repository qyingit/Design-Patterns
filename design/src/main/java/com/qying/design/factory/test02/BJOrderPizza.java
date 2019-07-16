package com.qying.design.factory.test02;

public class BJOrderPizza extends OrderPizza {
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
