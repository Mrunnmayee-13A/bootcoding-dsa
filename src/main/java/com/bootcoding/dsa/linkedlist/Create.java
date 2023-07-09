package com.bootcoding.dsa.linkedlist;

public class Create {
    public static void main(String[] args) {
     Node head= create();
     print(head);

    }
    public static Node create(){
        Node firstNode = new Node(23);
        Node secondNode = new Node(12);
        Node thirdNode = new Node(10);
        Node fourthNode = new Node(52);
        Node fifthNode = new Node(32);
        Node sixthNode = new Node(40);

        Node head= firstNode;
        firstNode.next =secondNode;
        secondNode.next =thirdNode;
        thirdNode.next =fourthNode;
        fourthNode.next =fifthNode;
        fifthNode.next =sixthNode;
        sixthNode.next = null;

        return head;
    }
      public static void print(Node head){
         Node temp = head;
          while (temp!= null){
            System.out.println(temp.data);
            temp= temp.next;
        }

    }

}
