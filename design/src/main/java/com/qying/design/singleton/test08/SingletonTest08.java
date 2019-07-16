package com.qying.design.singleton.test08;


public class SingletonTest08 {


    //有同步效果，但是加锁太重
    public static void main(String[] args) {

        for (int i =0 ;i<100 ;i++){
            new Thread(new Runnable() {
                public void run() {
                    Singleton instance = Singleton.INSTANCE;
                    System.out.println(instance.hashCode());
                }
            }).start();
        }
    }
}
