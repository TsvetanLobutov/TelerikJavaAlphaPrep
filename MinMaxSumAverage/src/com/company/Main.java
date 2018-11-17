package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double sum = 0;
        int num;

        for (int i=0; i < n; ++i) {
            num = in.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        double avg = sum / n;


        System.out.printf("min=%.2f\n", min);
        System.out.printf("max=%.2f\n", max);
        System.out.printf("sum=%.2f\n", sum);
        System.out.printf("avg=%.2f", avg);
    }

}
