package com.company;

import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();

        StringBuilder sb = new StringBuilder();
        long leastCommonDivisor;
        int counter;

        for(int i = 1; m != n; i++){
            if(m > n){
                m = m - n;
            }else {
                n = n - m;
            }
        }
        leastCommonDivisor = m;

        for(long i = 2; i <= leastCommonDivisor; i++){
            counter = 0;
            while (true){
                if(leastCommonDivisor % i == 0){
                    counter++;
                    leastCommonDivisor /= i;
                }else {
                    break;
                }
            }
            if(counter != 0){
                sb.append(i);
                sb.append(" ");
            }
        }
        if(sb.length() > 0){
            System.out.println(sb);
        }else {
            System.out.println(-1);
        }


    }
}
