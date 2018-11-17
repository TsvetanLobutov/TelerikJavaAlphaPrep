package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger T1 = in.nextBigInteger();
        BigInteger T2 = in.nextBigInteger();
        BigInteger T3 = in.nextBigInteger();
        int N = in.nextInt();
        BigInteger result = new BigInteger("0");

        if(N==1){
            System.out.println(T1);
        }else if(N==2){
            System.out.println(T2);
        }else if(N==3){
            System.out.println(T3);
        } else if(N==4){
            result = T1.add(T2);
            result = result.add(T3);
            System.out.println(result);

        } else {

            for (int i = 3; i < N; i++) {
              //  result = T1 + T2 + T3;
                result = T1.add(T2);
                result = result.add(T3);
                T1 = T2;
                T2 = T3;
                T3 = result;
            }
            System.out.println(result);
        }




    }
}
