package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySearch {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String[] inputArray = reader.readLine().split(",");
        int[] appearances = new int[inputArray.length + 1];

        for(int i = 0; i < inputArray.length; i++){
            appearances[Integer.parseInt(inputArray[i])]++;
        }
        for(int i = 1; i < appearances.length; i++){
            if(appearances[i] == 0)result.append(i).append(",");
        }
        if(result.length() == 0)return;

        result.setLength(result.length() - 1);
        System.out.println(result);

    }
}
