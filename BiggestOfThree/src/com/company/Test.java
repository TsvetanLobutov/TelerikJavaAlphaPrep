package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        double first, second, third;
        Scanner in = new Scanner(System.in);
        first = in.nextDouble();
        second = in.nextDouble();
        third = in.nextDouble();


        double largest = largestOfThree(first, second, third);

        if (largest % 1.0 == 0) {
            int myInt = (int) largest;
            System.out.println(myInt);;
        } else {
            System.out.println(largest);
        }

        in.close();

    }

    public static double largestOfThree(double first, double second, double third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else if (third > first && third > second) {
            return third;
    }else{
            return first;
        }

    }


}
