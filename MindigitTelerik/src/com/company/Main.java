package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mind = 10;

        if(n%10<mind && n%10!=0) mind = n%10;
        if(n/10%10<mind && n/10%10!=0) mind = n/10%10;
        if(n/100%10<mind && n/100%10!=0) mind = n/100%10;
        if(n/1000<mind && n/1000!=0) mind = n/1000;

        System.out.println(mind);


    }
}
