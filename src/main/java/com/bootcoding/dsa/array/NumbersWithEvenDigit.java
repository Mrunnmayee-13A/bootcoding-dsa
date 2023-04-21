package com.bootcoding.dsa.array;

public class NumbersWithEvenDigit {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};
        int even = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                count++;
            }
            if (count % 2 == 0) {
                even++;
            }
        }
        System.out.println(even);
    }
}
