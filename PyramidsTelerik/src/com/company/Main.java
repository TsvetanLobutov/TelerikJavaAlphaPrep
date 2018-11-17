package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();

       int c = 0;

       while(n > 0){

           c++;
           n -= c;

           if(n < (c + 1)){

               break;
           }


       }
        System.out.println(c);


    }
}