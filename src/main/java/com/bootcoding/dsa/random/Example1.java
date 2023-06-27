package com.bootcoding.dsa.random;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Random rd = new Random();
        String[] n = {"Aaloo", "bhaloo", "Chaloo"} ;
        for(int i =0; i<10; i++){
            int inx = rd.nextInt(0,3);
            int inx1 = rd.nextInt(0,3);
            System.out.println(n[inx]);
            System.out.print(n[inx1]);
        }
    }
}
