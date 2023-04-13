package com.bootcoding.dsa.string;

public class LowerUpperCase {
    public static void main(String[] args) {
        String s1= "DIWALI";
        String  s2= "diwali";
        boolean res = s1.equals(s2);
        String s3 = s1.toLowerCase();
        String s4 =s2.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
