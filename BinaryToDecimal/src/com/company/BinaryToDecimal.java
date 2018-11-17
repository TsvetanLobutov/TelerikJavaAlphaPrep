package com.company;

import java.util.Scanner;

public class BinaryToDecimal {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            //System.out.println("Enter a binary number:");


            int decimal=0,p=0;

            while(n!=0){
                decimal+=((n%10)*Math.pow(2,p));
                n = n/10;
                p++;
            }

            System.out.println(decimal);
        }
}

