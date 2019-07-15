package PrincipleDemo.Demeter;

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

        List<CollegeEmployee> allEmployee = collegeManager.getAllEmployee();
        for (CollegeEmployee collegeEmployee : allEmployee){
            System.out.println(collegeEmployee.getId());
        }

        for (Employee employee : this.getAllEmployee()){
            System.out.println(employee.getId());
        }

    }
}
