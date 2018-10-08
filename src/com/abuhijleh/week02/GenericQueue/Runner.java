package com.abuhijleh.week02.GenericQueue;

public class Runner {
    public static void main (String[] args){
//create a queue, its maxsize is 4
        GenericQueue<Integer> queue = new GenericQueueUsingArray(Integer.class,4);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(25);
        queue.enqueue(28);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(220);
        queue.enqueue(250);
        queue.enqueue(280);

    }


}