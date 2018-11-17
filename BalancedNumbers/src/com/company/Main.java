package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while(true){
            String number = in.nextLine();
            int x = number.charAt(0) - '0';
            int y = number.charAt(1) - '0';
            int z = number.charAt(2) - '0';

            if(x + z != y){
                break;
            }

            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}
