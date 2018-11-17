package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[2];
        int a =0;
        int b = 0;
        int r1 = 0;
        int r = 0;

        for(int i = 0; i < 2; i++){
            arr[i] = in.nextInt();
            a  = arr[0];
            b = arr[1];
        }


        while (a != 0) {
            r *= 10;
            r += (a % 10);
            a /= 10;
        }

        while (b != 0) {
            r1 *= 10;
            r1 += (b % 10);
            b /= 10;
        }

        if(r > r1){
            System.out.println(r);
        }else{
            System.out.println(r1);
        }

    }
}
