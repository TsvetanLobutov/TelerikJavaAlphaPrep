package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        // System.out.println("Give the number: ");
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();


        while(prim(n) == false){
            n--;
        }
        System.out.println(n);

    }


    public static boolean prim(int m){
        int n = m;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }

        }
        return true;
    }
}

