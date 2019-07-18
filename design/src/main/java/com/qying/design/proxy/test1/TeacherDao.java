package com.qying.design.proxy.test1;

public class TeacherDao implements ITeacherDao {
    public void teach() {
        System.out.println("老师讲。。");
    }

    public void sayHello(String name) {
        System.out.println("老师说 hello:"+name);
    }
}
