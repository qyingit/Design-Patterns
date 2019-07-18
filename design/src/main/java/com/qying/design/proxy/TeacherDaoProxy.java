package com.qying.design.proxy;


public class TeacherDaoProxy  implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    public void teach() {
        System.out.println("开始代理  完成某些操作。。。");
        target.teach();
        System.out.println("提交。。。。");
    }
}
