package com.bootcoding.dsa.recurrsion;

public class AddDigit {
    public static void main(String[] args) {
        int sum =0;
        int num = 38;

        while(num==0)
        num = num%10;
            sum = sum +num;
        if(sum<10){
            System.out.println(sum);
        }else{
            System.out.println("null");
        }

        System.out.println(sum);
    }
}
