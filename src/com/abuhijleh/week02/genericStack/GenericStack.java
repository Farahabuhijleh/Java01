package com.abuhijleh.week02.genericStack;

public interface GenericStack <E>{
    void push(E e);
    E pop();
    E peek();
    int size();
    boolean isEmpty();


}
