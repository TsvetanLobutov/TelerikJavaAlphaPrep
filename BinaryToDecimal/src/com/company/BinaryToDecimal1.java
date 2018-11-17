package com.company;

import java.util.Scanner;

public class BinaryToDecimal1 {
    public static void main(String args[]){
        Scanner input = new Scanner( System.in );
        //int n = input.nextInt();
        // System.out.print("Enter a binary number: ");
        String binaryString =input.nextLine();
        System.out.println(+Integer.parseInt(binaryString,2));
    }
}
