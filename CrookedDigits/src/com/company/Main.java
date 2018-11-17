package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int n = 0;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                n += ch - '0';
            }
        }
        while(n > 9){
            int newN = 0;

            while (n > 0){
                newN += n % 10;
                n /= 10;
            }
            n = newN;
        }
        System.out.println(n);
    }
}
