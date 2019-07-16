package com.qying.design.factory.test02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        String orderType = null;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
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
