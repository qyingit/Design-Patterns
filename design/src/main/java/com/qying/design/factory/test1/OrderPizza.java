package com.qying.design.factory.test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {
    SimpleFactory simpleFactory;

    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setFactrory(simpleFactory);
    }

    private void setFactrory(SimpleFactory simpleFactory) {
        String orderType = "";

        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("创建pizza失败");
                break;
            }
        }while (true);

    }

    private String getType() {

        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("pizza");
            String str = strin.readLine();
            return str;
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }

    }

}
