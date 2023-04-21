package com.bootcoding.dsa.string;

public class StringBuilderExample1 {
    public static void main(String[] args) {
        String S = "Roll no." + "," + "CSE" + "," + "M1" + "'" + "M2" + "," + "M3";
        StringBuilder sb =new StringBuilder();
        sb.append("Roll no.");
        sb.append(",");
        sb.append("CSE");
        System.out.println(sb);

    }
}