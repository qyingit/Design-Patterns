package com.qying.design.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printCollege() {
        Iterator<College> iterator =  colleges.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("======"+college.getName());
            printDepartment(college.createIterator());
        }
    }

    private void printDepartment(Iterator iterator) {
        while(iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
