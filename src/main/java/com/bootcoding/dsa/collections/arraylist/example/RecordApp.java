package com.bootcoding.dsa.collections.arraylist.example;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student details:");
        System.out.println("Enter the name of student");
        String name = scanner.next();
        System.out.println("Is pursuing");
        boolean isPursuing = scanner.nextBoolean();
        System.out.println("CGPA");
        double cgpa = scanner.nextDouble();

        //create object
        Record record = new Record();
        record.setName(name);
        record.setPursuing(isPursuing);
        record.setCgpa(cgpa);

        ArrayList<Record> records = new ArrayList<>();
        records.add(record);
        records.add(record);
        records.add(record);
        records.add(record);
        records.add(record);

        for (int i = 0; i < records.size(); i++) {
            System.out.println("Name :" + records.get(i).getName());
            System.out.println("isPursuing :" + records.get(i).isPursuing());
            System.out.println("cgpa :" + records.get(i).getCgpa());

        }
    }
}



