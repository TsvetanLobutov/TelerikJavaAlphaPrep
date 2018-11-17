package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        int sum = 0;
        int br = 0;

        char[] len = data.toCharArray();
        for (int i = 0; i < len.length; i++) {
            //try {
            char ch = data.charAt(i);

            if ((ch >= '0' && ch <= '9')) {
               // Character.getNumericValue(ch);
                sum = sum + ch - '0';
                br++;

            }
        }

        if (br == 0) {
            System.out.println("-1");

            // }catch (StringIndexOutOfBoundsException e){
            //    System.out.println("-1");
            //      break;
        } else {
            System.out.println(sum);
        }

    }
}

