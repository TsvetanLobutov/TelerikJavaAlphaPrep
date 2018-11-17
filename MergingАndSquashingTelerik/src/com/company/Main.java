package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[] numbers = new String[n];

        numbers[0] = reader.readLine();

        StringBuilder merge = new StringBuilder();
        StringBuilder squash = new StringBuilder();

        for(int i = 1; i <= n - 1;i++ ){
            numbers[i] = reader.readLine();

            merge.append(numbers[i - 1].charAt(1)).append(numbers[i].charAt(0)).append(" ");
            squash.append(numbers[i - 1].charAt(0)).append((numbers[i - 1].charAt(1) - '0' + numbers[i].charAt(0) - '0') % 10)
                    .append(numbers[i].charAt(1)).append(" ");

        }
        System.out.println(merge);
        System.out.print(squash);

    }
}
