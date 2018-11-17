package com.company;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float firstNum = in.nextFloat();
        float secondNum = in.nextFloat();
        float thirdNum = in.nextFloat();

        if (firstNum == secondNum) {
            if (secondNum == thirdNum) {
                System.out.println(firstNum);
                if (firstNum > secondNum && firstNum > thirdNum) {
                    System.out.println(firstNum);
                } else if (secondNum > firstNum && secondNum > thirdNum) {
                    System.out.println(secondNum);
                } else if (thirdNum > firstNum && thirdNum > secondNum) {
                    System.out.println(thirdNum);
                }
            }
        }
    }
}
