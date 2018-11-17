package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int h = in.nextInt();
        int per = 0;
        int max1 = a;
        int max2 = d;

        if(max1 <= b){
            max1 = b;
        }
        if(max1 <= c){
            max1 = c;
        }
        if(max2 <= h){
            max2 = h;
        }

        if(max1 <= max2){
            per=((a+b+c+d*2+h*2)-(max1+max2))+(max2-max1);
        }else{
            per=((a+b+c+d*2+h*2)-(max2+max1))+(max1-max2);
        }
        System.out.println(per);

    }
}
