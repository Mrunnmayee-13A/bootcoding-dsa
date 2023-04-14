package com.bootcoding.dsa.string;

public class YearMonthDay {
    public static void main(String[] args) {
        String  s ="2023-04-14";
        String [] s1 = s.split("-");
        String Year = s1[0];
        String Month =s1[1];
        String Day= s1[2];
        System.out.println(Year);
        System.out.println(Month);
        System.out.println(Day);
    }
}
