package com.abuhijleh.week02.GenericQueue;

public interface GenericQueue <E> {
    void enqueue(E e);

    E dequeue();

    boolean isEmpty();

    boolean isFull();

    int size();
}
