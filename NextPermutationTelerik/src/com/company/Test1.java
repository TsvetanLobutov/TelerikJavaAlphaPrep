package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
       // System.out.print("Enter integers please ");
       // System.out.println("(EOF or non-integer to terminate): ");

        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Collections.swap(list, 1, 4);

        Integer [] nums = list.toArray(new Integer[0]);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}


