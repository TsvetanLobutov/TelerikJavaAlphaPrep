package com.company;

import java.util.Scanner;

public class DecimalToHexExample2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();

   // public static String toHex(int decimal){
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n > 0){
            rem = n % 16;
            hex=hexchars[rem]+ hex;
            n = n / 16;
        }
        // return hex;
        System.out.println(hex);
   }
}
