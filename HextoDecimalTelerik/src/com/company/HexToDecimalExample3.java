package com.company;

import java.util.Scanner;

public class HexToDecimalExample3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        System.out.println(getDecimal(n));

    }
    public static long getDecimal(String hex){
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        long val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            long d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;

    }
}
