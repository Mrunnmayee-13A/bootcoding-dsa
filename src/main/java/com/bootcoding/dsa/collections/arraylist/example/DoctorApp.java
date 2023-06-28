package com.bootcoding.dsa.collections.arraylist.example;

import java.util.ArrayList;

public class DoctorApp {
    public static void main(String[] args) {

    DocRecord dr = new DocRecord();
    ArrayList<Doctor> doctor =dr.getDoctor(10000);

    for(int i=0; i< doctor.size(); i++){
        System.out.println("Name : " + doctor.get(i).getName());
        System.out.println("Education of Doctor : " + doctor.get(i).getEducation());
        System.out.println("Age : " + doctor.get(i).getAge());
        System.out.println("Type of Doctor : " +doctor.get(i).getType());

       }
    }
}

