package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int current = 1;
        int max = 1;
        int prev = in.nextInt();

        for(int i = 1; i < n; i++){
            int next = in.nextInt();

            if(prev < next){
                current++;
            }else {
                current = 1;
            }

            max = Math.max(current, max);
            prev = next;
        }
        System.out.println(max);
    }
}
