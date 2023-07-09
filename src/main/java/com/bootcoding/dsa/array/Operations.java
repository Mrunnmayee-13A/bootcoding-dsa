package com.bootcoding.dsa.array;

public class Operations {
    public static void main(String[] args) {
       String s[] = {"--X","X++","X++"};
       int x =finalValueAfterOperations(s);
        System.out.println(x);
    }
    public static int finalValueAfterOperations(String [] operations) {
        int x=0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("X++")){
                x=x+1;
            }else if(operations[i].equals("++X")){
                x=x+1;
            }else if(operations[i].equals("X--")){
                x=x-1;
            }else if(operations[i].equals("--X")){
                x=x-1;
            }
        }
        return x;
    }
}
