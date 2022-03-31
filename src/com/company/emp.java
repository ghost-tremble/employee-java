package com.company;

import java.util.ArrayList;

public class emp {
    public String name;
    public int salary;
    public String position;
    public ArrayList <emp> EmployeeList = new ArrayList<>();

    public ArrayList<emp> getEmployeeList() {
        System.out.println(EmployeeList);
        return EmployeeList;
    }
}
