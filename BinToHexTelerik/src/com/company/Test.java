package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int index = 0;
        String bin = in.nextLine();
        String[] hexString = new String[bin.length() / 4];
        for (int i = 0; i < bin.length() / 4; i++) {
            hexString[i] = "";
            for (int j = index; j < index + 4; j++) {
                hexString[i] += bin.charAt(j);
            }
            index += 4;
        }

        for (int i = 0; i < bin.length() / 4; i++) {
         //   System.out.print(hexString[i] + " ");
        }

       //  System.out.println("\n" + bin.length());
        String[] result = binaryToHex(hexString);

        for (int i = 0; i < result.length; i++) {
            System.out.print("" + result[i].toUpperCase());
        }
        System.out.println("");
    }

    public static String[] binaryToHex(String[] bin) {
        String[] result = new String[bin.length];
        for (int i = 0; i < bin.length; i++) {
            result[i] = Integer.toHexString(Integer.parseInt(bin[i], 2));
        }
        //return Integer.toHexString(Integer.parseInt(bin[0], 2));
        return result;
    }
}
