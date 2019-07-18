package com.qying.design.proxy;

public class TeacherDao implements ITeacherDao{
    public void teach() {
        System.out.println("老师授课 .....");
    }
}
