package com.bootcoding.dsa.array;

public class CopyEvenIndex {
    public static void main(String[] args) {
        int[] input ={3, 5, 7, 8, 10, 80};
        int count=0;
        for(int i=0;i<input.length;i++){
            if(i%2==0){
                count++;
            }
        }
        int[] output =new int[count];
        int index=0;
        for(int i=0; i<input.length; i++){
            if(i%2==0){
                output[index++]=input[i];
            }
        }
        System.out.println("Old Array ");
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println("\nNew Array ");
        for(int i=0; i<output.length; i++){
            System.out.print(output[i]+" ");
        }
    }
}


