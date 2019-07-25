package com.qying.design.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    private List<Person> persons = new LinkedList<Person>();

    void attach(Person p){
        persons.add(p);
    }

    void detach(Person p){
        persons.remove(p);
    }

    void display(Action action){
        for (Person p : persons){
            p.accept(action);
        }
    }
}
