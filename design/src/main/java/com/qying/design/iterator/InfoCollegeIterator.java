package com.qying.design.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {

    List<Department> departments;
    int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        if(index >= departments.size() -1){
            return false;
        }else {
            index +=1;
            return true;
        }
    }

    public Object next() {
        return departments.get(index);
    }

    public void remove() {

    }
}
