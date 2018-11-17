package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = in.nextDouble();
        double sum = 1;
        int faktor = 1;
        double pow = 1;

        for (int i = 1; i <= n; i++)
        {
            faktor *= i;
           pow *= x;
            sum += faktor / pow;
        }


        System.out.printf("%.5f", sum);

    }

    }
