package com.qying.design.factory.test03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory){
        setFactory(absFactory);
    }

    private void setFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = absFactory;

        do {
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            if ( pizza!= null){
                pizza.prepare();
            }else {
                System.out.println("订购失败");
            }
        }while (true);

    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("pizza");
            String str = strin.readLine();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
