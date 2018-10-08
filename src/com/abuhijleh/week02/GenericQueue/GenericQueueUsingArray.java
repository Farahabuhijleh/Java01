package com.abuhijleh.week02.GenericQueue;

import java.lang.reflect.Array;
/**
 * Author: Farah abu-hijleh
 * Date:   10-09-2018
 *
 *  implementation of a generic FIFO queue.
 */
public class GenericQueueUsingArray<E> implements GenericQueue<E> {
    private  E elements[];
        private int front,rear;
        private int size,maxQueueSize;
public GenericQueueUsingArray(Class<E> element , int maxQueueSize)
        {
            front=0;
            rear=-1;
            size=0;
            this.maxQueueSize= maxQueueSize;
            elements = (E[]) Array.newInstance(element,maxQueueSize);
        }
        /**  Adds an item to this queue. */
         public void enqueue(E e){
        if (isFull())
            return;
//moves the queue to the start of the array whenever it reaches the end
        if (rear== maxQueueSize -1){
            int j =0;
            for (int i= front;i <= rear ; i++){
                elements[j++] =elements[i];
            }
            front=0;
            rear=size-1;
        }
        elements[++rear]=e;
        size++;
    }
    /** Removes and returns the item on this queue that was least recently added. */
     public E dequeue(){
        if(isEmpty())
            return null;
        E saved = elements[front];
        elements[front]=null;
        front++;
        size--;
        return saved;
    }
    /** Tests if the stack is empty. */
     public boolean isEmpty(){
        return (size==0);
    }
    /** Tests if the stack is full. */
    public boolean isFull(){
        return (size==maxQueueSize);
    }
    /** returns the number of items in stack right now. */

     public int size(){
        return size;}
    }
