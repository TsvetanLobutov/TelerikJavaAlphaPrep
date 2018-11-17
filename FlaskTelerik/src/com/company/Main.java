package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOfFlasks = Double.parseDouble(scanner.next());
        double liquidVol = Double.parseDouble(scanner.next());
        double prevVol = 0;

        for (int i = 1; i <= numberOfFlasks ; i++) {
            double currVol = (i - 1) + prevVol;

            if (liquidVol <= currVol) {
                if (i % 2 != 0) {
                    System.out.println(i);
                } else {
                    System.out.println(i + 1);
                }
                break;
            }
            prevVol = currVol;
        }
    }
}
