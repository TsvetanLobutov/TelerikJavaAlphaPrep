package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int min = m < n ? m : n;

        boolean hasNums = false;

        int max;
        if(min % 2 == 0){
            max = min / 2;
        }else {
            max = (min + 1) / 2;
        }

        for (int i = 2; i <= max; i++){
            if(isPrime(i)){
                if(m % i == 0 && n % i == 0){
                    System.out.print(i + " ");
                    hasNums = true;
                }
            }

        }
        if(!hasNums){
            System.out.println("-1");

        }


    }

    public static boolean isPrime(int num){

        for(int i = 2; i < num; i++){

            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

