package com.bootcoding.dsa.array;

public class ElementsGreaterThanAvg {
    public static void main(String[] args) {
        int count =0;
        float avg=0;
        int sum=0;
        int input [] = {45,3,6,5,23};
          for(int i=0; i<input.length; i++){
              count++;
          }
          for (int i=0; i<input.length; i++){
              sum = sum+input[i];
              avg= sum/count;
          }
        System.out.println("Average of the Elements are = "+avg);
        System.out.println("The elements greater than average are ");
          for (int i=0; i< input.length; i++){
              if(input[i]>avg){
                  System.out.print(input[i]+" ");
              }
           }
       }
  }
