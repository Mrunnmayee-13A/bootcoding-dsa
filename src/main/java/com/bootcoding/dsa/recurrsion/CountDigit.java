package com.bootcoding.dsa.recurrsion;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println( getCount(250));
    }
    public static int getCount(int num){
        if(num==0){
            return 0 ;
        }
        return 1 + getCount(num/10);
    }
}
