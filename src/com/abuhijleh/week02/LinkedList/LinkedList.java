package com.abuhijleh.week02.LinkedList;
/**
 * Author: Farah abu-hijleh
 * Date:   10-09-2018
 *
 * A very simple implementation of a LinkedList.
 */
public class LinkedList {
Node head;

    /**Inserts a new Node. */
public void insert(int data){
    Node node = new Node();
    node.data=data;
    node.next=null;
    if(head==null){
        head = node;
    }
    else{
        Node n = head;
        while (n.next != null){


            n = n.next;
        }
        n.next=node;
    }
}
/** show LinkedList elements. */
public void show(){
    Node node = head;
    while (node.next != null){
        System.out.println(node.data);
        node=node.next;
    }
    System.out.println(node.data);

}
    /** Inserts a new Node at front of the list. */
    public void insertAtStart(int data) {
    Node node = new Node();
    node.data =data;
    node.next=null;
    node.next=head;
    head=node;
    }
    /** Inserts a new Node at specific index. */
public  void insertAt(int index,int data){
    Node node =new Node();
    node.data=data;
    node.next=null;

    if (index == 0) {
    insertAtStart(data);
    }


else{
        Node n = head;
    for (int i=0; i < index-1;i++){
        n =n.next;
    }
    node.next =n.next;
    n.next = node;

}}
    /**delete a Node at specific index. */
public void deleteAt (int index){
    if (index == 0) {
       head = head.next;
    }
    else
    {
        Node n = head;
        Node n1= null;
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        n1=n.next;
        n.next=n1.next;
        System.out.println("n1"+ n1.data);
        n1=null;
    }

}
}
