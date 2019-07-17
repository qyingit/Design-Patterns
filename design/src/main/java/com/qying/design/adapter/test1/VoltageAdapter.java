package com.qying.design.adapter.test1;

public class VoltageAdapter implements IVoltage5V{

    //对象适配器于类适配器是通一思想，实现方式不同
    //对象解决了类适配器必须继承src的局限性，也不要求dst是接口
    //成本低，更灵活

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public int output5V() {
        int dst = 0;
        if (null != voltage220V){
            int src = voltage220V.output220V();
            System.out.println("适配。。。");
            dst = src/44;
            System.out.println("适配完成");
        }
        return dst;
    }
}
