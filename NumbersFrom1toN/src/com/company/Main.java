package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int number = 0;

        for(int i = 0; i < n; i++){
            number++;
            if(number % 3 != 0 && number % 7 != 0)
            System.out.print(number);
        }

    }
}
