package com.abuhijleh.week02;

import java.util.Arrays;
import java.util.Random;

public class _01_Arrays {

    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    public static void main(String[] args) {
        int[] ints1 = new int[10]; // Create array
        int[] ints2 = new int[]{1, 2, 3, 4, 5}; // Create and initialize

        for (int i : ints1) {
            System.out.println(i);
        } // all zeros

        for (int i : ints2) {
            System.out.println(i);
        }

        // copy ints2 to biggerInts2
        int[] biggerInts2 = new int[ints2.length * 2];
        System.arraycopy(ints2, 0, biggerInts2, 0, ints2.length);
        System.out.println("--");
        for (int i : biggerInts2) {
            System.out.println(i);
        }
        System.out.println("--");

        // Arrays of objects
        MyNum[] myNums = new MyNum[3];

        Random random = new Random();
        for (int i = 0; i < myNums.length; i++) {
            myNums[i] =  new MyNum(random.nextInt());
        }

        for (MyNum myNum : myNums) {
            System.out.println(myNum);
        }

        System.out.println("=================");

        for (int i = 0; i < myNums.length; i++) {
            myNums[i] = myNums[i].plusOne();
        }

        for (MyNum myNum : myNums) {
            System.out.println(myNum);
        }

        System.out.println("*********");
        System.out.println(Arrays.toString(biggerInts2));
        Arrays.fill(ints1, 5);
        System.out.println(Arrays.toString(ints1));
    }

    private static class MyNum {
        int num;

        public MyNum(int num) {
            this.num = num;
        }

        public MyNum plusOne() {
            return new MyNum(this.num + 1);
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return String.valueOf(this.num);
        }
    }
}