package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        emp emp1 = new emp();
        emp emp2 = new emp();
        emp1.name = "Ali";
        emp1.salary = 2000;
        emp1.position = "staff";

        emp2.name="jack";
        emp2.salary = 1000;
        emp2.position="manager";


        emp employees = new emp();
Managers manager1 = new Managers();

manager1.name ="jack";

        employees.EmployeeList.add(emp1);
        employees.EmployeeList.add(emp2);
       ArrayList<emp> jacksList = employees.getEmployeeList();
        manager1.EmployeeList =  jacksList;

        manager1.getEmployeeList();
        manager1.AverageSalary();


    }
}
