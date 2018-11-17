package com.company;

import java.text.DecimalFormat;

public class Main {
    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String[] args) {

        double n = Math.sqrt(12345);


        System.out.println( df2.format(n));
    }
}
