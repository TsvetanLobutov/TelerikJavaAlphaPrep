package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        String NInput = new StringBuilder(input[0]).reverse().toString();
        int K = Integer.parseInt(input[1]);

        int N = Integer.parseInt(NInput);
        //int K = Integer.parseInt(KInput);

        int quotient = N / K;
        int remainder = N % K;

        int result = quotient + remainder;
        System.out.println(result);

    }
}
