package com.bootcoding.dsa.leetccode;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1};
        boolean b = containsDuplicate(a);
        System.out.println(b);
    }
    public static boolean containsDuplicate(int[] numbs) {
        Arrays.sort(numbs);
        for (int i = 0; i < numbs.length; i++) {
                if (numbs[i] == numbs[i+1]) {
                    return true;
                }
            }
        return false;
    }
 }


