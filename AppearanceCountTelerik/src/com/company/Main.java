package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int br = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int x = in.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                br++;
            }
        }
        System.out.println(br);

    }
}
