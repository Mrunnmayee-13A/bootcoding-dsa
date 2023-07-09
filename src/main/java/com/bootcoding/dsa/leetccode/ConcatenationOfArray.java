package com.bootcoding.dsa.leetccode;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] numbs = {1, 3, 1};
        int[] ans = getConcatenation(numbs);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
      public static int[] getConcatenation(int[] numb) {
        int n = numb.length;
        int ans[] = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = numb[i];
            ans[i + n] = numb[i];
        }
        return ans;
    }
}
