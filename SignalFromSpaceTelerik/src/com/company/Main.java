package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr = in.nextLine();
        String output = "";

        for (int index = 0; index < arr.length(); index++) {
            if (arr.charAt(index % arr.length()) != arr.charAt((index + 1) % arr.length())) {

                output += arr.charAt(index);

            }
        }
        System.out.println(output);


    }
}
