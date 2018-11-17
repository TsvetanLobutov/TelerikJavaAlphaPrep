package com.company;

import java.util.Scanner;

public class DecimalToHexExample {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();

        // For storing remainder
        int rem;

        // For storing result
        String str2="";

        // Digits in hexadecimal number system
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(n > 0) {
            rem=n%16;
            str2=hex[rem] + str2;
            n=n/16;
        }
        System.out.println(str2);
    }
}
