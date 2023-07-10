package com.bootcoding.dsa.linkedlist;

public class InsertionAtLast {
    public static void main(String[] args) {
        Node firstNode = new Node ( 1);
        Node secondNode = new Node(2 );
        Node thirdNode = new Node ( 3);
        Node fourthNode = new Node(4 );

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;

        Node newList;
        newList = insertionAtLast(firstNode);
        Create.print(newList);
    }
    public static Node insertionAtLast(Node head) {
        Node newNode = new Node(5);
        Node temp = head;
        while (temp.next != null) {
            temp= temp.next;
        }
        temp.next = newNode;
        return head;
    }
}
