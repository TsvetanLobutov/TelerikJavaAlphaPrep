package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];

        for(int i = 0; i < 4; i++) {
            arr[i] = in.nextInt();
        }
            if(arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]){
                System.out.println("Ascending");
            }else if(arr[0] > arr[1] && arr[1] > arr[2] && arr[2] > arr[3]){
                System.out.println("Descending");
            }else{
                System.out.println("Mixed");
            }
        }


    }

