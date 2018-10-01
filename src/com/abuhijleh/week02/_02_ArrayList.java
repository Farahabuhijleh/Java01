package com.abuhijleh.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_ArrayList {

    public static void main(String[] args) {
        List<Integer> integers1 = new ArrayList<>();
        List<Integer> integers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // in Java 9 we have better utils for this
        integers1.add(5);
        integers1.add(20);
        integers1.add(25);
        integers1.add(20 + 9);
        integers1.add(2000);

//        integers1.forEach(i -> System.out.println(i));
//        integers1.forEach(System.out::println);

        System.out.println(integers1);
        System.out.println(integers2);
        System.out.println(integers1.addAll(integers2));
        System.out.println(integers1);
        System.out.println(integers2.contains(3));
        System.out.println(integers2.contains(30));
        System.out.println(integers2.indexOf(3));
        System.out.println(integers2.lastIndexOf(3));
        integers1.removeIf(x -> x < 5);
        System.out.println(integers1);
        integers1.replaceAll(x -> x + 5);
        System.out.println(integers1);
        System.out.println(integers1.get(3));
    }
}
