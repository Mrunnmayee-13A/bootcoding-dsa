package com.bootcoding.dsa.linkedlist;

public class DeleteFirstNode {
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

        Node newList = deletionOfFirstNode(head);
        Create.print(newList);

    }
    public static Node deletionOfFirstNode(Node head){
       Node temp= head;
        head = temp.next;
        return head;
    }
}

