package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GolemiChisla {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String cardCount = reader.readLine();

        String str = reader.readLine().replaceAll("\\s+", "");

        int n = str.length();  // get length of input string

        // table[i][j] will be false if substring str[i..j]
        // is not palindrome.
        // Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];

        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;

        // check for sub-string of length 2.
        int start = 0;

        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for lengths greater than 2. k is length
        // of substring
        for (int k = 3; k <= n; ++k) {

            // Fix the starting index
            for (int i = 0; i < n - k + 1; ++i) {
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;

                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if (table[i + 1][j - 1] && str.charAt(i) ==
                        str.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }

        printSubStrInt(str, start, start + maxLength - 1);
    }

    private static void printSubStrInt(String str, int low, int high) {
        String resultAsString = str.substring(low, high + 1);
        StringBuilder resultNoTrailingZeroes = new StringBuilder();

        int zeroesLastIndex = 0;

        while(resultAsString.charAt(zeroesLastIndex) == '0') zeroesLastIndex++;

        for (int i = zeroesLastIndex; i < resultAsString.length() - zeroesLastIndex; i++) {
            resultNoTrailingZeroes.append(resultAsString.charAt(i));
        }
        System.out.println(resultNoTrailingZeroes);

    }
}
