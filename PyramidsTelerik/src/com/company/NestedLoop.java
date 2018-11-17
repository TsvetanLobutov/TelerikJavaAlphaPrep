package com.company;

public class NestedLoop {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {

            System.out.println("Outer loop iteration " + i);

            for (int j = 1; j <= 2; ++j) {
                System.out.println("i = " + i + "; j = " + j);
            }

            ++i;
        }
    }
}
