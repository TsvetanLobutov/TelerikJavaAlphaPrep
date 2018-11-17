package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        BigInteger factN = BigInteger.valueOf(1) ;
        BigInteger factK = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
       for(int i=1;i <= n; i++){
           // factN = factN * i;
           factN = factN.multiply(BigInteger.valueOf(i));
       }
            for(int j=1;j <= k; j++){
                // factK = factK * j;
                factK = factK.multiply(BigInteger.valueOf(j));
            }
            sum = factN.divide(factK);

        System.out.println(sum);
    }
}
