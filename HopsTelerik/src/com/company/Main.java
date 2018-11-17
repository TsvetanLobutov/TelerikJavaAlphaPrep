package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] field = stringToIntArray(in.readLine().split(", "));
        int M = Integer.parseInt(in.readLine());
        int biggest = Integer.MIN_VALUE;

        for(int i = 0; i < M; i++){
            int[] nums = stringToIntArray(in.readLine().split(", "));
            int current = 0;
            int currentSum = 0;
            int[] mask = field.clone();
            int index = 0;
            while(mask[current] != 0){
                currentSum += mask[current];
                mask[current] = 0;
                current += nums[index];
                index++;
                if(index >= nums.length){
                    index -= nums.length;
                }
                if (current < 0){
                    break;
                }else if(current >= mask.length){
                    break;
                }
            }
            if(current > biggest){
                biggest = currentSum;
            }

        }
        System.out.println(biggest);
    }
    public static int[] stringToIntArray(String[] text){
        int[] nums = new int[text.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(text[i]);
        }
        return nums;
    }
}
