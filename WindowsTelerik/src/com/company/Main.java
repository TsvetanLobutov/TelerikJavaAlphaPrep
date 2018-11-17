package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int price = 0;

        for(int i = 0; i < n ; i++){
            int v = in.nextInt();
            int s = in.nextInt();
            int dn = in.nextInt();


            if(dn == 1){
                price = price + v*s*c;

            }

        }

        System.out.println(price);
    }
}
