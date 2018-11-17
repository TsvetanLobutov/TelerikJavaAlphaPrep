package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();

        BigInteger bi1 = new BigInteger("1");
        BigInteger count = n;
        for(int i = 0; i < 10; i++ ){

             count = count.add(bi1);
            System.out.println(count);

        }

    }
}
