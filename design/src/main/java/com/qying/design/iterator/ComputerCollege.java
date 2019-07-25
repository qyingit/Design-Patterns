package com.qying.design.iterator;


import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    int numOfDepartment = 0;
    public String getName() {
        return "计算机学院";
    }

    public ComputerCollege() {
        this.departments = new Department[5];

        addDepartment("Java","java专业");
        addDepartment("go","go专业");
        addDepartment("scala","scala专业");

    }

    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
