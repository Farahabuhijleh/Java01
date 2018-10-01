package com.abuhijleh.week02;

import java.util.LinkedList;

public class _03_LinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(5);
        integers.add(50);
        integers.add(500);
        System.out.println(integers);
        System.out.println(integers.removeFirst());
        System.out.println(integers);
        System.out.println(integers.getFirst());
        System.out.println(integers);
    }
}
