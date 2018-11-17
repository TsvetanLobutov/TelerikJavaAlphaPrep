package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = in.nextDouble();

        double result = 1;
        double ifac = 1;
        for (int i = 1; i <= n; i++) {
            ifac = 1; //This line is very important
            for (int j = i; j >= 1; j--) {
                ifac *= j;
            }
            result += ifac / Math.pow(x, i);
        }

        System.out.printf("%.5f", result);


    }

}








