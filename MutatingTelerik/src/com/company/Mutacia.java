package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mutacia {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String organismCount = reader.readLine();

        String input = reader.readLine();
        int fatalities = 0;

        for(int i = input.length() - 1; i>=0; i--){
            int beforeMutation = 0;
            int afterMutation = 0;
            int multiplier = 1;
            char currentChar = input.charAt(i);
            while(true){
                if(currentChar == ' ') break;

                beforeMutation += (currentChar - '0') *multiplier;
                if(currentChar == '0') currentChar = '9';
                else if(currentChar == '9') currentChar = '0';
                else if(currentChar % 2 == 0) currentChar--;
                else currentChar++;

                afterMutation += (currentChar - '0') * multiplier;
                if(i == 0) break;;
                multiplier *= 10;
                currentChar = input.charAt(--i);
            }

            int gcd = GCD(beforeMutation, afterMutation);
            if(gcd / 10 < 1) fatalities++;
        }

        System.out.println(fatalities);

    }
    private static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b, a % b);
    }

}
