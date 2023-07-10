package com.bootcoding.dsa.recurrsion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacci(55));
    }
    public static int getFibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return getFibonacci(n-1)+getFibonacci(n-2);
    }
}
