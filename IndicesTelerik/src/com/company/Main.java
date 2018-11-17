package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] inputNumbers = new int[n];
        for(int i = 0; i < n; i++){
            inputNumbers[i] = in.nextInt();
        }

        boolean cycle = false;
        int cycleStart = 0;
        boolean[] visitedIndices = new boolean[n];
        visitedIndices[0] = true;
        ArrayList<Integer> outputNumbers = new ArrayList<>();
        outputNumbers.add(0);
        int index = 0;
        while(true){
            if(inputNumbers[index] >= 0){
                if(inputNumbers[index] <= inputNumbers.length - 1){
                    if(!visitedIndices[inputNumbers[index]]){
                        outputNumbers.add(inputNumbers[index]);
                        visitedIndices[inputNumbers[index]] = true;
                        index = inputNumbers[index];
                    }else {
                        cycle = true;
                        cycleStart = inputNumbers[index];
                        break;
                    }
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        if(cycle){
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < outputNumbers.size(); i++){
                if(outputNumbers.get(i) == cycleStart){
                    if(i > 0){
                        result.deleteCharAt(result.length() - 1);
                        result.append("(");
                    }else{
                        result.append("(");
                    }
                }
                result.append(outputNumbers.get(i)).append(" ");
            }
            result.deleteCharAt(result.length() - 1);
            result.append(")");
            System.out.println(result);
        }else{
            for(int i = 0; i < outputNumbers.size(); i++){
                System.out.print(outputNumbers.get(i) + " ");
            }
        }
    }
}
