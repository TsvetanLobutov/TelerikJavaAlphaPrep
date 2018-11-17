package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            int number = in.nextInt();
            int oddsSum = 0;
            int evensSum = 0;

            while(number > 0){
                int digit = number % 10;
                if(digit % 2 == 0){
                    evensSum += digit;
                }else{
                    oddsSum += digit;
                }
                number /= 10;
            }

            if(evensSum < oddsSum){
                System.out.println("right");
            }else if(evensSum > oddsSum){
                System.out.println("left");
            }else{
                System.out.println("straight");
            }
        }
    }
}
