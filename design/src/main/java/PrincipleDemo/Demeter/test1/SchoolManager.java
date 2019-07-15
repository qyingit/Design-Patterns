package PrincipleDemo.Demeter.test1;

import java.util.ArrayList;
import java.util.List;

public class SchoolManager {

    public List<Employee> getAllEmployee(){
        List<Employee> employees = new ArrayList<Employee>();
        for (int i =0 ;i<5;i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id = "+ i);
            employees.add(employee);
        }
        return employees;
    }

    public void printAllEmployee(CollegeManager collegeManager) {

        collegeManager.printEmployee();

        System.out.println("学校总部员工----");
        for (Employee employee : this.getAllEmployee()){
            System.out.println(employee.getId());
        }

    }
}
