package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();

        if(A > B){

            A = A + B;
            B = A - B;
            A = A - B;

            if (A % 1.0 == 0 && B % 1.0 == 0) {
                int myInt = (int) A;
                int myInt1 = (int) B;
                System.out.println(myInt + " " + myInt1 );;
            } else {
                System.out.println(A + " " + B);
            }

        }else {
            if (A % 1.0 == 0 && B % 1.0 == 0) {
                int myInt = (int) A;
                int myInt1 = (int) B;
                System.out.println(myInt + " " + myInt1 );;
            } else {
                System.out.println(A + " " + B);
            }

        }

    }
}
