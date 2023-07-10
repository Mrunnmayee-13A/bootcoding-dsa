package com.bootcoding.dsa.recurrsion;

import com.bootcoding.dsa.linkedlist.Create;
import com.bootcoding.dsa.linkedlist.Node;

public class TraverseLinkedList {
    public static void main(String[] args) {
       Node head= Create.create();
       linkedList(head);
    }
    public static void linkedList(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");
        linkedList(head.next);
       // System.out.print(head.data + " ");

    }
}
