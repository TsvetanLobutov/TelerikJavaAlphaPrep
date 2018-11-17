package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChetniChisla {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        int maxSum = -1;

        for(int i = text.length() - 2; i >= 0; i--){

            char currentChar = text.charAt(i);

            if(Character.isDigit(currentChar)){

                if(currentChar % 2 == 0){
                    int currentSum = 0;
                    int modifier = 1;
                    while (Character.isDigit(currentChar) && i >= 0){
                        currentSum += (currentChar - '0')* modifier;
                        if(i==0) break;
                        modifier *= 10;
                        currentChar = text.charAt(--i);
                    }
                    if(currentSum > maxSum) maxSum =currentSum;
                }else{
                    while(Character.isDigit(text.charAt(i)) && i > 0){
                        i--;
                    }
                }
            }
        }

        System.out.println(maxSum);


    }
}
