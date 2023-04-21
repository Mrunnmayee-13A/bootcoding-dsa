package com.bootcoding.dsa.array;

public class DiffElementsofSumAndDigits {
    public static void main(String[] args) {
        int [] nums ={1,15,6,3};
        int sum=0;
        for(int i =0; i<nums.length; i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
        int count=0;
        for(int i=0; i<nums.length;i++) {
           count= nums[i] + nums[i] / 10;
        }
            System.out.println(count);
    }
}

