package com.bootcoding.dsa.recurrsion;

public class Even {
    public static void main(String[] args) {
        getEven(20);
    }
    public static void getEven(int n){
        if(n==0){
            return;
        }
        if(n%2==0){
            System.out.println(n);
        }
        getEven(n-1);
    }
}

