package com.qying.design.bridge;

public class Client {

    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();

        System.out.println("+====================");
        Phone phone1 = new FoldedPhone(new Vivo());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("====================");
        UpRightPhone phone2 = new UpRightPhone(new XiaoMi());
        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("=====================");
        UpRightPhone phone3 = new UpRightPhone(new Vivo());
        phone3.open();
        phone3.call();
        phone3.close();

    }
}
