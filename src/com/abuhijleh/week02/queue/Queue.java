package com.abuhijleh.week02.queue;
/**
 * Author: Farah abu-hijleh
 * Date:   10-09-2018
 *
 * A very simple implementation of a FIFO queue.
 */

public class Queue {
    // Create a queue of integers of size 15
    int queue [] = new  int [15];
    int size;
    int front;
    int rear;
    /** Inserts an element into the queue. */

    public void enQueue (int data){

        queue[rear]=data;
        rear=rear+1;
        size =size+1;

    }

    /** Removes an element from the queue and returns it. */
    public int deQueue(){
        int data = queue[front];
        front=front+1;
        size=size+1;
        return data;
    }
/** show queue elements. */
    public void show(){
        System.out.println("Elements  :");
        for (int i=0;i<size;i++){

            System.out.println(queue[front+i]+" ");
        }
    }
}
