package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int br1 = 0;
        int br2 = 0;

        String inputString = in.nextLine();
        String[] arrString = inputString.split(" ");
        Integer[] arr = new Integer[arrString.length];
        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(arrString[i]);
            if (arr[i] == 2) {
                br1++;
            }
            if (arr[i] == 6) {
                br2++;
            }
        }
        if (br1 != 0 || br2 == 0) {
            System.out.print("No");
        }else {
            for (int j = 1; j <= br2; j++) {
                System.out.print("*");
            }
        }

        }
    }


