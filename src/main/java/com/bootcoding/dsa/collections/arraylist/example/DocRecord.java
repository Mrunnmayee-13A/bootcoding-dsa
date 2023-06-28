package com.bootcoding.dsa.collections.arraylist.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DocRecord {
  public ArrayList<Doctor> getDoctor(int size) {
    ArrayList<Doctor>doctor = new ArrayList<>();

    for (int i =0; i<size; i++){
      Doctor doctors = buildDoctor();
      doctor.add(doctors);
    }
    return doctor;
  }
  public Doctor buildDoctor() {
    Doctor doctor = new Doctor();
    doctor.setName(getRandomName());
    doctor.setEducation(getEducation());
    doctor.setAge(getAge());
    doctor.setType(getType());
    return doctor;
  }
  public String getRandomName(){
    String n[] = {"Dr.Sai", "Dr.Mandar", "Dr.Ram", "Dr.Sharma", "Dr.Advika", "Dr.Ankur", "Dr.Shweta"};
    int randomIndex = new Random().nextInt(n.length);
    return n[randomIndex];
  }
  public String getEducation(){
    String e[]= {"M.B.B.S", "B.D.S", "B.H.M.S", "Ayurvedic","Surgeon","M.D"};
    int randomIndex = new Random().nextInt(e.length);
    return e[randomIndex];
  }
 public int getAge(){
    int min = 28;
    int max = 60;
   return min + new Random().nextInt(max-min);
  }

  public String getType(){
    String t[]= {"Cardiologist", "NeuronSurgeon", "Gynaecologist", "Urologist","Orthopedic"};
    int randomIndex = new Random().nextInt(t.length);
    return t[randomIndex];
  }

}
