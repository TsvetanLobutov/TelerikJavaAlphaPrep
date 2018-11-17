package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        double first, second, third,forth,fifth;
        Scanner in = new Scanner(System.in);
        first = in.nextDouble();
        second = in.nextDouble();
        third = in.nextDouble();
        forth = in.nextDouble();
        fifth = in.nextDouble();


        double largest = largestOfThree(first, second, third, forth, fifth);

        if (largest % 1.0 == 0) {
            int myInt = (int) largest;
            System.out.println(myInt);;
        } else {
            System.out.println(largest);
        }

        in.close();

    }

    public static double largestOfThree(double first, double second, double third, double forth, double fifth) {
        if (first > second && first > third && fifth > forth && first > fifth) {
            return first;
        } else if (second > first && second > third && second > forth && second > fifth) {
            return second;
        } else if (third > first && third > second && third > forth && third > fifth) {
            return third;
        }else if (forth > first && forth > second && forth > third && forth > fifth) {
            return forth;
        }else if (fifth > first && fifth > second && fifth > third && fifth > forth) {
            return fifth;
        } else{
            return first;
        }

    }
}
