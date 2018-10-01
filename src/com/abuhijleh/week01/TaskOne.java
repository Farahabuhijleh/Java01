package com.abuhijleh.week01;

import java.util.Scanner;

public class TaskOne {

    private static final Scanner askScanner = new Scanner(System.in);

    private static double answer; // instance variable that stores the answer
    private static double firstNumber; // instance variable that stores the first number
    private static double secondNumber; // instance variable that stores the second number

    public static void main(String[] args) {
        taskOne();
    }

    public static void taskOne() {
        System.out.println("Basic calculator");
        System.out.println("Pick one:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int pick = askScanner.nextInt();

        if (pick == 1) {
            addition();
        } else if (pick == 2) {
            subtraction();
        } else if (pick == 3) {
            multiplication();
        } else if (pick == 4) {
            division();
        } else {
            System.out.println("You need to choose 1, 2, 3, or 4");
            taskOne();
        }
        askScanner.close();
    }

    // method to get numbers
    private static void getNumbers() { // OK!
        System.out.println("First number?");
        firstNumber = askScanner.nextDouble();
        System.out.println("Second Number?");
        secondNumber = askScanner.nextDouble();
    }

    // method to get the difference of the two numbers
    public static void subtraction() {
        System.out.println("Subtraction");
        getNumbers();
        answer = firstNumber - secondNumber;
        System.out.println("This is the difference of the two numbers:  " + answer);
        taskOne();
    }

    /**
     * method to get the sum of the two numbers\
     * // TODO change others
     */
    public static void addition() {
        System.out.println("Addition");
        getNumbers();
        answer = firstNumber + secondNumber;
        System.out.println("This is the sum of the two numbers:  " + answer);
        taskOne();
    }

    //method to get the product of the two numbers
    public static void multiplication() {
        System.out.println("Multiplication");
        getNumbers();
        answer = firstNumber * secondNumber;
        System.out.println("This is the product of the two numbers  " + answer);
        taskOne();
    }

    //method to get the  quotient of the two numbers
    public static void division() {
        System.out.println("Division");
        getNumbers();
        answer = firstNumber / secondNumber;
        System.out.println("This is the quotient of the two numbers:    " + answer);
        taskOne();
    }

}