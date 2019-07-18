package com.qying.design.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    public College(String name ,String des){
        super(name,des);
    }

    protected void add(OrganizationComponent organizationComponent){
        organizationComponentList.add(organizationComponent);
    }

    protected void remove(OrganizationComponent organizationComponent){
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    protected void print(){
        System.out.println("====="+getName()+"======");
        for (OrganizationComponent organizationComponent : organizationComponentList){
            organizationComponent.print();
        }
    }
}

