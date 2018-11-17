package com.company;

import java.util.Scanner;

public class HexToBin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexNum = sc.nextLine();
        StringBuilder binNum = new StringBuilder();

        if (hexNum.equals("0")) {
            System.out.println("0");

        } else {
            for (int i = 0; i < hexNum.length(); i++) {

                char ch = hexNum.charAt(i);

                switch (ch) {

                    case '0':
                        binNum.append("0000");
                        break;
                    case '1':
                        binNum.append("0001");
                        break;
                    case '2':
                        binNum.append("0010");
                        break;
                    case '3':
                        binNum.append("0011");
                        break;
                    case '4':
                        binNum.append("0100");
                        break;
                    case '5':
                        binNum.append("0101");
                        break;
                    case '6':
                        binNum.append("0110");
                        break;
                    case '7':
                        binNum.append("0111");
                        break;
                    case '8':
                        binNum.append("1000");
                        break;
                    case '9':
                        binNum.append("1001");
                        break;
                    case 'A':
                        binNum.append("1010");
                        break;
                    case 'B':
                        binNum.append("1011");
                        break;
                    case 'C':
                        binNum.append("1100");
                        break;
                    case 'D':
                        binNum.append("1101");
                        break;
                    case 'E':
                        binNum.append("1110");
                        break;
                    case 'F':
                        binNum.append("1111");
                        break;

                }
            }

            System.out.println(binNum.toString().replaceAll("^0+", ""));
        }
    }
}
