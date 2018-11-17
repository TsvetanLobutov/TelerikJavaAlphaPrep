package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger factorielN = BigInteger.valueOf(1);
        BigInteger factoriel2N = BigInteger.valueOf(1);
        BigInteger  factorielNplus1 = BigInteger.valueOf(1);

        for (int i = 1; i <= n ; i++)
            // factorielN *= i;
        factorielN = factorielN.multiply(BigInteger.valueOf(i));

        for (int i = 1; i <= (2*n); i++)
            // factoriel2N *= i;
            factoriel2N = factoriel2N.multiply(BigInteger.valueOf(i));

        // factoriel2N = factoriel2N.multiply(i);

        for (int i = 1; i <= (n + 1); i++)
           // factorielNplus1 *= i;
        factorielNplus1 = factorielNplus1.multiply(BigInteger.valueOf(i));

        //System.out.print( factoriel2N / (factorielN * factorielNplus1));
//        System.out.println(factoriel2N);
//        System.out.println(factorielN);
//        System.out.println(factorielNplus1);
        System.out.print( factoriel2N.divide(factorielN.multiply(factorielNplus1)));


    }
}
