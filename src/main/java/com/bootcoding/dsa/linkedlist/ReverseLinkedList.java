package com.bootcoding.dsa.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node firstNode = new Node(21);
        Node secondNode = new Node(42);
        Node thirdNode = new Node( 35);
        Node fourthNode = new Node(43);
        Node fifthNode = new Node(53);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next=fifthNode;
        fifthNode.next = null;

        Node reverseList = reverseLinkedList(head);
        Create.print(reverseList);
    }
    public static Node reverseLinkedList(Node head){
        Node prev = null;
        Node current = head;
        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current= next;
        }
        return prev;
    }
}
