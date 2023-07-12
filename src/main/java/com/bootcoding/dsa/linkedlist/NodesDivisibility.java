package com.bootcoding.dsa.linkedlist;
public class NodesDivisibility {
    public static void main(String[] args) {
        Node firstNode = new Node(5);
        Node secondNode = new Node(24);
        Node thirdNode = new Node(31);
        Node fourthNode = new Node(42);
        Node fifthNode = new Node(63);

        Node head= firstNode;
        firstNode.next =secondNode;
        secondNode.next =thirdNode;
        thirdNode.next =fourthNode;
        fourthNode.next =fifthNode;
        fifthNode.next = null;

        checkDivisible(head);
    }

    public static void checkDivisible(Node head){
        Node temp= head;
        while (temp!=null){
            if(temp.data%3==0 || temp.data %5 ==0) {
                System.out.println(temp.data);
            }
            temp =temp.next;
        }
    }
}
