package com.abuhijleh.week02.stack;
/**
 * Author: Farah abu-hijleh
 * Date:   10-09-2018
 *
 * A very simple implementation of a LEFO stack.
 */
public class Stack {

    int stack[] = new int[5];
    int top =0;
/** Pushing element on the top of the stack. */
    public void push(int data){
        stack[top] = data;
        top++;
    }
    /** Popping element from the top of the stack. */
     public int pop(){
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;
    }
    /** Displaying element on the top of the stack. */
     public int peek(){

        int data;
        data =stack[top-1];
        return data;

    }
    /** show stack elements. */
public  void show(){

        for (int n : stack){
            System.out.print(n + " ");
        }
}
}
