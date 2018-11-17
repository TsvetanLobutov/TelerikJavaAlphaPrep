package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int[] one = new int[first];
        int[] two = new int[second];
        for (int i = 0; i < one.length; i++) {
            one[i] = input.nextInt();
        }
        for (int i = 0; i < two.length; i++) {
            two[i] = input.nextInt();
        }
        int length = Biggest(one.length, two.length);
        ArrayList<Integer> numbers = new ArrayList<>(1);
        int remainder = 0;
        for (int i = 0; i < length || remainder != 0; i++) {
            if (i == length ) {
                numbers.add(remainder);
                remainder = 0;
            } else {
                int mask = remainder;
                if (i >= one.length) {
                    mask += two[i];
                } else if (i >= two.length) {
                    mask += one[i];
                } else {
                    mask += one[i] + two[i];
                }
                if (mask < 9) {
                    numbers.add(mask);
                    remainder = 0;
                } else {
                    numbers.add(mask % 10);
                    remainder = mask / 10;
                }
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + " ");
            }
        }

    }

    public static int Biggest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}


