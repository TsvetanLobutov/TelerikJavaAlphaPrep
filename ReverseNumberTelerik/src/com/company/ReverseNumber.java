package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double input = s.nextDouble();
        double result = reverse(input);

       if (result % 1.0 != 0) {
            int myInt = (int) result;
            System.out.println(myInt);
        } else {
            System.out.println(result);
        }

      //  System.out.println(result);
    }

    public static double reverse(double n) {

        String input = String.valueOf(n);
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result = result + input.charAt(i);
        }
        double reversedInt = Double.parseDouble(result);
        return reversedInt;

    }
}