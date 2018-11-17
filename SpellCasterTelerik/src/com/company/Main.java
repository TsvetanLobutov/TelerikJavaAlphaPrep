package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] magicWords = reader.readLine().split(" ");
        System.out.println(SecondStep(FirstStep(magicWords)));

    }
    private static StringBuilder FirstStep(String[] magicWords){

        int maxWordLength = 1;

        StringBuilder printout = new StringBuilder();
        for(int indexModifier = 0; indexModifier < maxWordLength; indexModifier++){
            for(int i = 0 ;i < magicWords.length; i++){
                int currentWordLength = magicWords[i].length();
                if(currentWordLength > maxWordLength) maxWordLength = currentWordLength;
                int currentCharIndex = (currentWordLength - 1) - indexModifier;
                if(currentCharIndex < 0)continue;
                char currentChar = magicWords[i].charAt(currentCharIndex);
                printout.append(currentChar);
            }
        }
        return printout;
    }
    private static StringBuilder SecondStep(StringBuilder secondStep){

        int length = secondStep.length();
        for(int i = 0; i < length; i++){
            char currentChar = secondStep.charAt(i);
            secondStep.deleteCharAt(i);
            int step = Character.toLowerCase(currentChar) - 96;
            int filedToLand= (i + step) % length;
            secondStep.insert(filedToLand, currentChar);
        }
        return secondStep;
    }
}
