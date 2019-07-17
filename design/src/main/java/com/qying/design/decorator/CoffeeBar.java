package com.qying.design.decorator;

public class CoffeeBar {

    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("费用"+order.cost());
        System.out.println("描述"+order.getDes());

        order = new Milk(order);
        System.out.println("order加牛奶费用"+order.cost());
        System.out.println("order加牛奶描述"+order.getDes());

        order = new Chocolate(order);
        System.out.println("order加巧克力费用"+order.cost());
        System.out.println("order加巧克力描述"+order.getDes());

        System.out.println("=================");

        Drink order2 = new DeCaf();
        System.out.println("order2无因咖啡费用"+order2.cost());
        System.out.println("order2无因咖啡描述"+order2.getDes());

        order2 = new Milk(order2);
        System.out.println("order2无因咖啡加牛奶费用"+order2.cost());
        System.out.println("order2无因咖啡加牛奶描述"+order2.getDes());
    }
}
