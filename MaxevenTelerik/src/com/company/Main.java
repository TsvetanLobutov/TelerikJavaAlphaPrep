package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        int a = 0;
        int max = -1;
        int i = 0;
        boolean b = false;

        char[] charArray = n.toCharArray();



        while (charArray[i]!='.') {

            if ( charArray[i]>='0' && charArray[i]<='9') {
                a = a * 10 + (charArray[i] - 48); b = true;

            } else {
                if (b && (a % 2 == 0) && a > max) {
                    max = a;
                }
                a = 0;
            }
            i++;
        }

        System.out.println(max);


    }
}
