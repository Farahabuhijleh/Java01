package com.abuhijleh.week02.genericStack;

public class Runner {
    public static void main (String args[]){
    GenericStack<Integer> stack= new GenericArrayStack<>(Integer.class,5);
    stack.push(5);
    stack.push(6);
    stack.push(7);
    stack.push(8);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.peek());


}}

