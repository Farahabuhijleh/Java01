package com.abuhijleh.week01;

import java.util.Scanner;

public class TaskTwo {
    // instance variable that stores the MAX_CHAR
    private static final int MAX_CHAR = 256;

    // method to get the occurring name
    private static void getOccurringChar(String str) {
        // Create an array of size 256 i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
        //local variable to store length of the string
        int len = str.length();

        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println("Number of Occurrence of " +
                        str.charAt(i) + " is:" + count[str.charAt(i)]);
        }
    }

    //method to find String
    private static int findString(String str) {

//        String str = "helloslkhellodjladfjhello";
//        String findStr = "hello";
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(str, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += str.length();
            }
        }

//        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        String str = "hello";
        getOccurringChar(str);
        System.out.println(findString(str));
    }
}