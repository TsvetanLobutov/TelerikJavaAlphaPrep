package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());
        int n5 = Integer.parseInt(scanner.nextLine());
        //int average = (n1 + n2 + n3 + n4 + n5) / 5;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;
        int result6 = 0;
        int result7 = 0;
        int result8 = 0;
        int result9 = 0;
        int result10 = 0;


        for (int i = 1; i <= 34221600; i++) {
            if(i % n1 == 0 && i % n2 == 0 && i % n3 == 0 && result1 == 0) {
                result1 = i;
            }
            if (i % n1 == 0 && i % n2 == 0 && i % n4 == 0 && result2 == 0) {
                result2 = i;
            }
            if (i % n1 == 0 && i % n2 == 0 && i % n5 == 0 && result3 == 0) {
                result3 = i;
            }
            if (i % n2 == 0 && i % n3 == 0 && i % n4 == 0 && result4 == 0) {
                result4 = i;
            }
            if (i % n2 == 0 && i % n3 == 0 && i % n5 == 0 && result5 == 0) {
                result5 = i;
            }
            if (i % n3 == 0 && i % n4 == 0 && i % n5 == 0 && result6 == 0) {
                result6 = i;
            }
            if (i % n1 == 0 && i % n3 == 0 && i % n4 == 0 && result7 == 0) {
                result7 = i;
            }
            if (i % n1 == 0 && i % n3 == 0 && i % n5 == 0 && result8 == 0) {
                result8 = i;
            }
            if (i % n1 == 0 && i % n4 == 0 && i % n5 == 0 && result9 == 0) {
                result9 = i;
            }
            if (i % n2 == 0 && i % n4 == 0 && i % n5 == 0 && result10 == 0) {
                result10 = i;
            }
            if (result1 != 0 && result2 != 0 && result3 != 0 && result4 != 0 && result5 != 0 && result6 != 0 && result7 != 0
                    && result8 != 0 && result9 != 0 && result10 != 0) {
                int finalResult = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(result1, result2),
                        result3), result4), result5), result6), result7), result8), result9), result10);
                System.out.println(finalResult);
                break;
            }
        }
        //System.out.printf("Results are: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d.", result1, result2, result3, result4, result5,
        //                result6, result7, result8, result9, result10);
    }
}