package com.bootcoding.dsa.array;

public class RunningSumArray {
    public static void main(String args[]) {

        int[] nums = {1, 2, 3, 4};
        int[] arr = runningSum(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
        public static int[] runningSum(int[] nums){
            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i - 1] + nums[i];
            }
            return nums;
        }
    }

