package com.bootcoding.dsa.string;

public class SubString {
    public static void main(String[] args) {

        String str = "Programming";
        String word = "Ram";
        if (str.contains(word)) {
            System.out.println("Ram Exists");
        }
        // str.subString(begin, end);
        String sub = str.substring(0, 8);
        System.out.println(sub);
        String sub2 = str.substring(0, str.indexOf('i'));
        System.out.println(sub2);
    }
}
