package com.qying.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    List<Department> departments;

    public InfoCollege() {
        departments = new ArrayList<Department>();
        addDepartment("信息安全","信息安全专业");
        addDepartment("网络安全","网络安全专业");
    }

    public String getName() {
        return "信息工程学院";
    }

    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
