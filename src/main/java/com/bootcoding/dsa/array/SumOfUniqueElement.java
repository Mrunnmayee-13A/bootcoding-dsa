package com.bootcoding.dsa.array;

public class SumOfUniqueElement {
    public static void main(String[] args) {
       int[] nums ={1,2,3,2};
            int sum=0;
            for(int i=0; i<nums.length; i++){
                for(int j=1; j<nums.length; j++){
                    if(nums[i]==nums[j]){
                       break;
                    }else {
                        sum=sum+nums[i];
                    }
                }
            }
        System.out.println(sum);
        }
    }
