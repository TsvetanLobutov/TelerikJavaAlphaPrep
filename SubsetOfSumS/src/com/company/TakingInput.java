package com.company;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        in.nextLine();
        String mask = in.nextLine();
        String[] maskArr = mask.split(" ");
        int[] nums = new int[maskArr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(maskArr[i]);
        }
        if (Subset(nums, S)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean Subset(int[] numbers, int sum) {
        int status = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current == sum) {
                status = 1;
                break;
            } else if (status == 0){
                for (int j = 0; j < numbers.length; j++) {
                    if (i != j) {
                        current+= numbers[j];
                        if (current == sum) {
                            status = 1;
                            break;
                        } else if (current > sum) {
                            current -= numbers[j];
                        }
                    }
                }
            }
        }
        if (status == 0) {
            return false;
        } else {
            return true;
        }
    }
}
