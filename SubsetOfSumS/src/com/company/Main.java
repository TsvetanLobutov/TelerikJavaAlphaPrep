package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int sum = 0;
        boolean hasSum = false;

        in.nextLine();
        String inputString = in.nextLine();
        String[] arrString = inputString.split(" ");
        Integer[] arr = new Integer[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            arr[i] = Integer.parseInt(arrString[i]);
        }

        for(int i = 0; i < arr.length; i++){

            sum = arr[i];

            for(int j = i +1; j < arr.length; j++){


                sum = sum + arr[j];
                if(sum == S){
                    hasSum = true;
                    break;
                }
                else if(sum > S){
                    break;
                }

            }
            if(sum == S){
                break;
            }
        }
        if(hasSum){
            System.out.println("yes");
        }else{
            System.out.println("no");
            System.out.println(S + " " + inputString);
        }

    }
}