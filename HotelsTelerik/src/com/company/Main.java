package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max1 = 0;
        int max2 = 0;
        int br1 = 0;
        int br2 = 0;

        int[] arr = new int[n + 1];

        for(int i = 1; i <= n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i <= n; i++){

            if(arr[i] > max1){
                br1++;
                max1=arr[i];
            }

        }
        for(int i = n; i >= 1; i--){
            if(arr[i]>max2)
            {
                br2++;
                max2=arr[i];
            }
        }
        // in.close();
        System.out.println(br1 + " " + br2);


    }
}
