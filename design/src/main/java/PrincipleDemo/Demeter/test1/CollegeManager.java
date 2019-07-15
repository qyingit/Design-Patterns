package PrincipleDemo.Demeter.test1;

import PrincipleDemo.Demeter.CollegeEmployee;

import java.util.ArrayList;
import java.util.List;

public class CollegeManager {

    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> employees = new ArrayList<CollegeEmployee>();
        for (int i = 0 ; i<10;i++){
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工id="+i);
            employees.add(employee);
        }
        return employees;
    }

    public void printEmployee(){
        for (CollegeEmployee collegeEmployee : getAllEmployee()){
            System.out.println(collegeEmployee.getId());
        }
    }
}
