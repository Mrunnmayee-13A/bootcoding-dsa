package com.bootcoding.dsa.linkedlist;
public class DeletionOfLastNode {
    public static void main(String[] args) {
        Node firstNode = new Node ( 1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node ( 3);
        Node fourthNode = new Node(4);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;

        //Node newList;
        deletionOfLastNode(head);
        Create.print(head);
    }
    public static void deletionOfLastNode(Node head){
        Node temp = head;
        while(temp!= null) {
            if (temp.next.next == null){
                temp.next = null;
                return;
            }
            temp = temp.next;
        }
    }
}
















































