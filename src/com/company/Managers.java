package com.company;

import java.util.ArrayList;

public class Managers  extends  emp{


    @Override
    // take in the parameter of an emplooyee List
    public ArrayList<emp> getEmployeeList() {
        // for loop
        for(int i=0; i<=EmployeeList.size();i++){
            System.out.println(EmployeeList.size());
            System.out.println(i);
// as the loop goes on  it will check the employee list for the employee with the the property name that evaluates as "Ali"

            if (EmployeeList.get(i).name.contains("jack")){

              ArrayList<emp> singleEmployee = new ArrayList<>(); // new Employee object
              singleEmployee.add(EmployeeList.get(i));
                System.out.println(EmployeeList.get(i).name);
                System.out.println(singleEmployee.get(0)); // get the single match from the new list

              return singleEmployee;

            }
            else {
                System.out.println("no employee matches");
                return EmployeeList;
            }

        }

return super.getEmployeeList();

    }
    public void AverageSalary(){
        // a default value set == 0
        int totalValue = 0;

     for(int i =0; i<EmployeeList.size();i++){
         totalValue = totalValue +EmployeeList.get(i).salary;
         // default value updates in the loop adding all the salaries of the employees
     }
     // average
     int averageSalary = totalValue / EmployeeList.size();

        System.out.println(averageSalary); // prints the average salary
    }
}
