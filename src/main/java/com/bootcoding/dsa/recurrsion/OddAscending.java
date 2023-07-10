package com.bootcoding.dsa.recurrsion;

public class OddAscending {
    public static void main(String[] args) {
        getOdd(25);
    }

    public static void getOdd(int n){
        if(n==0){
            return;
        }
        getOdd(n-1);
        if(n%2!=0){
            System.out.println(n);
        }
    }
}
