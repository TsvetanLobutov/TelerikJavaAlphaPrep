package com.company;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        int[] currentPerm = new int[n];

        for(int i = 0; i < input.length; i++){
            currentPerm[i] = Integer.parseInt(input[i]);
        }

    }
    static void nextPermutation(int[] currentPerm){
        if(currentPerm == null || currentPerm.length <= 1)
            return;
            // find the index of the first element from right to left that is less than its previous one
            int lIndex = 0;

            for(int i = currentPerm.length - 2; i >= 0;i-- ){

                if(currentPerm[i] < currentPerm[i + 1]){
                    lIndex = i;
                    break;
                }
            }
            // find the index of the first element from right to left that is greater than num at lIndex
        int gIndex = 0;

        for (int i = currentPerm.length - 1; i > lIndex; i--) {

            if (currentPerm[i] > currentPerm[lIndex]) {
                gIndex = i;
                break;
            }
        }
// swap elements at lIndex and GIndex

        if (lIndex == 0 && gIndex == 0) { // if is increasing sequence
            reverse(currentPerm, 0, currentPerm.length - 1);
            return;
        }

        int temp = currentPerm[lIndex];
        currentPerm[lIndex] = currentPerm[gIndex];
        currentPerm[gIndex] = temp;

// reverse elements from lIndex to currentPerm.length - 1

        if (lIndex < currentPerm.length - 1) {
            reverse(currentPerm, lIndex + 1, currentPerm.length - 1);
        }


    }

    static void reverse(int[] currentPerm, int left, int right) {

        while (left < right) {

            int temp = currentPerm[left];
            currentPerm[left] = currentPerm[right];
            currentPerm[right] = temp;
            left++;
            right--;
        }
    }
}
