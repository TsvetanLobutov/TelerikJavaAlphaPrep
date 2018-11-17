package com.company;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int count = 0;
        int Multiple = 0;

        for(int i = 0; i < count; i ++){

            if (Multiple % a == 0){
                count++;
            } else if(Multiple % b == 0){
                count++;
            }else if( Multiple % c == 0){
                count++;
            } else if(Multiple % d == 0 ){
                count++;
            } else if(Multiple % e == 0) {
                count++;
            }
                if (i >= 3) {

                    break;
                }
            System.out.println(Multiple);
            }
    }
}

