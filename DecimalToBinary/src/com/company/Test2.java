package com.company;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if (number < 0) {
            System.out.println("Error: Not a positive integer");
        } else {
            printBinaryform(number);
        }
    }

    private static void printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return; // KICK OUT OF THE RECURSION
        }
        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}
