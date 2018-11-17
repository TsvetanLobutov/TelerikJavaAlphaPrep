package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        int a = n.charAt(0) - '0';
        int b = n.charAt(1) - '0';
        int c = n.charAt(2) - '0';

        int result = -1;

        result = Math.max(result, a + b + c);
        result = Math.max(result, a * b + c);
        result = Math.max(result, a + b * c);
        result = Math.max(result, a * b * c);

        System.out.println(result);

    }
}
