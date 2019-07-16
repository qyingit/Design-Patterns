package com.qying.design.factory;

public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        String orderType ;
        do {
//            orderType = getType();
//
//            if (orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊pizza");
//            }else if(orderType.equals("cheess")){
//                pizza = new CheessPizza();
//                pizza.setName("奶酪pizza");
//            }else if (orderType.equals("china")){
//                pizza = new ChinaPizza();
//                pizza.setName("中国pizza");
//            }else {
//                break;
//            }
//
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
        }while (true);
    }

    private String getType() {
        return null;
    }
}
