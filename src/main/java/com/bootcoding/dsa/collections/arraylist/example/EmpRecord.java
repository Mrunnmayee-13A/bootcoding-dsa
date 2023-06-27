package com.bootcoding.dsa.collections.arraylist.example;

import java.util.ArrayList;
import java.util.Random;

public class EmpRecord {
    public ArrayList<Employee> getEmployee(int size) {
        ArrayList<Employee> employee = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Employee employees = buildemployee();
            employee.add(employees);
        }
        return employee;
    }
     public Employee buildemployee(){
        Employee employee = new Employee();
        employee.setName(getRandomName());
        employee.setExperience(getRandomExperience());
        employee.setSalary(getRandomSalary());
        employee.setAge(getRandomAge());

        return employee;
    }
    protected String getRandomName(){
        String[] name ={"Abhishek", "Shweta", "Sakshi", "Rohan", "Ketaki", "Raj", "Rishi"};
        Random rd = new Random();
        int innx =rd.nextInt(name.length);
        return name[innx];
    }

    private int getRandomExperience(){
        int min = 1;
        int max = 10;
        return min + new Random().nextInt(max-min);
    }

    private double getRandomSalary(){
        double min = 20000.0;
        double max = 100000.0;
        return min + new Random().nextDouble(max-min);
    }

    private int getRandomAge(){
        int min = 21;
        int max = 50;
        return min + new Random().nextInt(max-min);

    }

}
