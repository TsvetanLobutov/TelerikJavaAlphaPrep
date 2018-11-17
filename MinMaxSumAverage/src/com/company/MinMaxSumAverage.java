package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMaxSumAverage {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numbers = Integer.parseInt(reader.readLine());
        double min = Double.parseDouble(reader.readLine());
        double max = min;
        double sum = min;

        for (int i = 1; i < numbers; i++) {
            double current = Double.parseDouble(reader.readLine());

            if (current > max) max = current;
            else if (current < min) min = current;

            sum += current;
        }
        double avg = sum / numbers;

        System.out.printf("min=%.2f\n", min);
        System.out.printf("max=%.2f\n", max);
        System.out.printf("sum=%.2f\n", sum);
        System.out.printf("avg=%.2f", avg);
    }
}