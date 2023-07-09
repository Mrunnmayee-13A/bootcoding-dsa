package com.bootcoding.dsa.recurrsion;

public class MinimumElement {
    public static void main(String[] args) {
        int[]arr={9,87,6,56,10};
        System.out.println(getMin(arr,Integer.MAX_VALUE,0));
    }
    public static int getMin(int[]a, int min, int i){
        if(i==a.length-1){
            return min;
        }
        if(min>a[i]){
            min=a[i];
        }
        return getMin(a,min,++i);
    }
}
