package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long r1 = in.nextLong();
        long r2 = in.nextLong();
        long r3 = in.nextLong();
        long r4 = in.nextLong();

        long a = 0;
        long b = 0;
        long c = 0;
        long d = 0;
        boolean f = true;
        a = -1000;


        do {
            if (a!=0) {
                b=-1000;
            do {
                if (b!=0)
            {c=a*a*b;
             d=a*b*b;
                if (((a==r1)||(r1==0))&& ((b==r2)||(r2==0))&& ((c==r3)||(r3==0))&& ((d==r4)||(r4==0))) {
                    System.out.println(a + " " + b + " " + c + " " + d );
                    f = false;
                }
            }
                b++;} while ((b<=a)&&f);
        }
            a++;
        }
        while ((a<=1000)&&f);
        // return 0;



    }
}
