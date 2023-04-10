package com.bootcoding.dsa.array;

public class CopyEvenArray {
    public static void main(String[] args) {
        int[] a ={14, 67, 88, 69, 171, 28};
        int count =0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0) {
                count++;
            }
        }
        int b[]= new int[count];
        int index=0;
        for (int i=0; i<a.length;i++) {
            if (a[i] % 2 == 0) {
                b[index++] = a[i];
            }
        }
        System.out.println("Old Array");
        for(int i=0;i< a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nNew Array");
        for (int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
        }
    }

