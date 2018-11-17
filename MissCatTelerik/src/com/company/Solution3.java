package com.company;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] cat = new int[11];

        for(int i = 0; i < n; i++ ){
            byte vote = in.nextByte();
            cat[vote]++;
        }

        int bestCat = 0;
        int bestCatVotes = 0;

        for(int i = 0; i < cat.length; i++){
            if(cat[i] > bestCatVotes){
                bestCat = i;
                bestCatVotes = cat[i];
            }
        }
        System.out.println(bestCat);

    }
}
