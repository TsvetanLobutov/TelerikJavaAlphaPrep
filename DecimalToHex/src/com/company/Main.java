package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            long n = in.nextLong();
            if (n < 0) {
                System.out.println("Enter a positive integer");
                return;
            }
            long i = 0, d = 0;
            String hx = "", h = "";
            while (n > 0) {
                d = n % 16;
                n /= 16;
                if (d == 10) h = "A";
                else if (d == 11) h = "B";
                else if (d == 12) h = "C";
                else if (d == 13) h = "D";
                else if (d == 14) h = "E";
                else if (d == 15) h = "F";
                else h = "" + d;
                hx = "" + h + hx;
            }
            System.out.println(hx);

    }
}