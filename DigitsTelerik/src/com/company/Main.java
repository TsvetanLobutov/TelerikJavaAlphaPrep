package com.company;

// test is the correct one for juje

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.next();
        int sum = 0;

        int len = data.length();
        for (int i = 0; i < len; i++) {
            char ch = data.charAt(i);

            if ((ch >= '0' && ch <= '9')) {
                Character.getNumericValue(ch);
                sum = sum + ch - '0';


            }else{
                System.out.println("-1");
            }
        }
        System.out.println(sum);
    }
}
