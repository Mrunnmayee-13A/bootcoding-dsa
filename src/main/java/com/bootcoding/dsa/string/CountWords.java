package com.bootcoding.dsa.string;

public class CountWords {
    public static void main(String[] args) {

        String str = "Java is platform Independent";
        String [] tokens= str.split(" ");
        System.out.println(tokens.length);
        String skills ="C, C++, java, python";
        String [] tech = skills.split(",");
        System.out.println("The Candidate knows "+tech.length+" Languages");
    }
}
