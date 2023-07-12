package com.bootcoding.dsa.linkedlist;

public class InsertionAtFirst {
    public static void main(String[] args) {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);

        Node head= firstNode;
        firstNode.next =secondNode;
        secondNode.next =thirdNode;
        thirdNode.next =fourthNode;
        fourthNode.next =null;
        Node newList = insertionAtFirst(head);
        Create.print(newList);

    }
    public static Node insertionAtFirst( Node head){

        Node newNode = new Node(5) ;
        newNode.next = head;
        head= newNode;

        return head;
    }
}


