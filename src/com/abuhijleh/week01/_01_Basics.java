package com.abuhijleh.week01;

import java.util.Scanner;

/**
 * @author Farah AbuHajleh
 */
public class _01_Basics {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter sth:");
//        String in = scanner.next();
        // TODO read a char
//        System.out.println("You entered: " + in);

        // StringBuilder
        StringBuilder str = getString();

        // ;s\gs\
        System.out.println(str);

        // kjls;
        for (int i = 0; i < 100; i++) {
            str.append(" HiAgain ");
        }

        int x = addNumbers(20, 400);

        System.out.println(str.toString());
        System.out.println(x);
    }

    /**
     * add two numbers blablala
     *
     * @param i first number
     * @param j second number
     * @return the summation
     * @throws RuntimeException
     */
    public static int addNumbers(int i, int j) {
        return i + j;
    }

    private static StringBuilder getString() {
        return new StringBuilder("Hi" + " World" +
                " World2" +
                " World3" +
                " World4");
    }
}
