package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] sizeInput = reader.readLine().split(" ");

        int rows = Integer.parseInt(sizeInput[0]);

        StringBuilder currentWord = new StringBuilder();

        String firstWord = "{";

        String[] crossroad = new String[rows];

        for (int row = 0; row < rows; row++) {
            crossroad[row] = reader.readLine();
            for (int j = 0; j < crossroad[0].length(); j++) {
                char currentChar = crossroad[row].charAt(j);

                if (currentChar != '#') {
                    currentWord.append(currentChar);
                } else {
                    if (currentWord.length() > 1) {
                        String currentWordAsStr = currentWord.toString();
                        if (currentWordAsStr.compareTo(firstWord) < 0 && currentWordAsStr.length() > 1) {
                            firstWord = currentWordAsStr;
                        }
                    }

                    currentWord = new StringBuilder();
                }
            }

            String currentWordAsStr = currentWord.toString();
            if (currentWordAsStr.compareTo(firstWord) < 0 && currentWordAsStr.length() > 1) {
                firstWord = currentWordAsStr;
            }
            currentWord = new StringBuilder();
        }

        for (int col = 0; col < crossroad[0].length(); col++) {
            for (int row = 0; row < rows; row++) {
                char currentChar = crossroad[row].charAt(col);
                if (currentChar != '#') {
                    currentWord.append(currentChar);
                } else {
                    if (currentWord.length() > 1) {
                        String currentWordAsStr = currentWord.toString();
                        if (currentWordAsStr.compareTo(firstWord) < 0 && currentWordAsStr.length() > 1) {
                            firstWord = currentWordAsStr;
                        }
                    }

                    currentWord = new StringBuilder();
                }
            }
            String currentWordAsStr = currentWord.toString();
            if (currentWordAsStr.compareTo(firstWord) < 0 && currentWordAsStr.length() > 1) {
                firstWord = currentWordAsStr;
            }
            currentWord = new StringBuilder();
        }

        System.out.println(firstWord);
    }
}
