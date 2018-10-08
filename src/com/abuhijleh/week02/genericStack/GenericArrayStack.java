package com.abuhijleh.week02.genericStack;

import java.lang.reflect.Array;
/**
 * Author: Farah abu-hijleh
 * Date:   10-09-2018
 *
 *  implementation of a generic LEFO stack.
 */
public class GenericArrayStack<E> implements GenericStack<E>{
private E elements[];
private int size;
private int top;

public GenericArrayStack(Class<E> element , int size){

        this.size=size;
        top = -1;
        elements = (E[]) Array.newInstance(element,size);


        }
        /** adds an item to the stack. */
public void push (E e){
        if (top < size-1){
        elements[++top] = e;
        }}
/** return the top item and removes it from stack */
public E pop(){
        E x = null;
        if (top >=0){
        x= elements[top--];
        }
        return x;
        }
public E peek(){
        E x = null;
        if(top >= 0){
        x=elements[top];
        }
        return x;
        }
        /** returns true if stack is empty, false otherwise. */
    public boolean isEmpty()
    {
        return (top == -1);
    }
/** returns the number of items in stack right now. */
    public int size()
    {
        return (top + 1);
    }}