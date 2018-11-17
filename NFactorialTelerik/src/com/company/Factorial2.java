package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String fact = factorial(n);
        System.out.println(fact);

    }
    public static String factorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact.toString();
    }
}
