package com.bootcoding.dsa.array;

public class CopyOddElementRev {
    public static void main(String[] args) {
        int[] input = {3, 45, 56, 76, 79, 57};
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {
            }
        }
        int[] output = new int[count];
        int index = output.length;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {
                output[index++] = input[i];
            }
        }
        System.out.println("Old Array is");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("\nNew Array after reverse is");
        for (int i = 0; i < output.length / 2; i++) {
            int temp = output[i];
            output[i] = output[output.length - i - 1];
            output[output.length - i - 1] = temp;
            for (i = 0; i < output.length; i++) {
                System.out.print(output[i] + " ");
            }
        }
    }
}

