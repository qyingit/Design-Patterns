package com.qying.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<College>();
        ComputerCollege computerCollege = new ComputerCollege();

        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();

        System.out.println("================");
        collegeList.add(infoCollege);
        outPut.printCollege();


    }
}
