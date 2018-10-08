package com.abuhijleh.week02.stack;

public class Runner {
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(15);
        nums.push(8);
        System.out.println(nums.peek());
        nums.push(10);
        System.out.println(nums.pop());
        System.out.println(nums.peek());
        nums.show();

    }
}
