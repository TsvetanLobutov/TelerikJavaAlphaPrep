package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            String number = in.nextLine();
            int x = number.charAt(0) - '0';
            int y = number.charAt(1) - '0';
            int z = number.charAt(2) - '0';

            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            break;
            }

    }
}
