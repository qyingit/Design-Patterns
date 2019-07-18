package com.qying.design.proxy.test1;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }


    public Object getProxyInstance() {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理模式开始");
                        Object returnVal = method.invoke(target,args);
                        System.out.println("JDK代理完成");
                        return returnVal;
                    }
                });

    }
}
