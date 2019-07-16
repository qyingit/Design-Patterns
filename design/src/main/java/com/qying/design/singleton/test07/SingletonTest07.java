package com.qying.design.singleton.test07;



public class SingletonTest07 {


    //有同步效果，但是加锁太重
    public static void main(String[] args) {

        for (int i =0 ;i<100 ;i++){
            new Thread(new Runnable() {
                public void run() {
                    Singleton instance = Singleton.getInstance();
                    System.out.println(instance.hashCode());
                }
            }).start();
        }
    }
}
