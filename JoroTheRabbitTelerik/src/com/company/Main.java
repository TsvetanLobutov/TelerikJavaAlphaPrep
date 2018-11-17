package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(", ");
        int[] filed = new int[input.length];

        for(int i = 0; i< filed.length; i++){
            filed[i] = Integer.parseInt(input[i]);
        }

        int maxLen = 0;

        for(int startPos = 0; startPos < filed.length; startPos++){
            for(int step = 1; step < filed.length; step++){
                int visited = 1;
                int index = startPos;
                int nextPos = index + step;
                if(nextPos >= filed.length){
                    nextPos -= filed.length;
                }

                while (filed[index] < filed[nextPos]){
                    visited++;
                    index = nextPos;
                    nextPos = (index + step) % filed.length;
                }
                maxLen = Math.max(maxLen, visited);
            }
        }
        System.out.println(maxLen);
    }
}
