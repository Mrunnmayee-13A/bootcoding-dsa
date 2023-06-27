package com.bootcoding.dsa.collections.arraylist.example;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpApp {
    public static void main(String[] args) {
        EmpRecord er = new EmpRecord();
        ArrayList<Employee> employees = er.getEmployee(10000);
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(i);
            System.out.println("Name: " + employees.get(i).getName());
            System.out.println("Experience: " + employees.get(i).getExperience());
            System.out.println("Salary: " + employees.get(i).getSalary());
            System.out.println("Age: " + employees.get(i).getAge());

        }
    }
}
