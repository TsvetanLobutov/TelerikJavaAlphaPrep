package com.company;

import java.util.Scanner;

public class BinToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder binNum = new StringBuilder(input);

        if (input.matches("0+")) {
            System.out.println("0");
        }

        switch (binNum.length() % 4) {

            case 0:
                break;
            case 1:
                binNum.insert(0, "000");
                break;
            case 2:
                binNum.insert(0, "00");
                break;
            case 3:
                binNum.insert(0, "0");
                break;
        }

        StringBuilder hexNum = new StringBuilder();

        for (int i = 0; i < binNum.length(); i += 4) {
            StringBuilder temp = new StringBuilder();

            temp.append(binNum.charAt(i));
            temp.append(binNum.charAt(i + 1));
            temp.append(binNum.charAt(i + 2));
            temp.append(binNum.charAt(i + 3));

            switch (temp.toString()) {

                case "0000":
                    hexNum.append("0");
                    break;
                case "0001":
                    hexNum.append("1");
                    break;
                case "0010":
                    hexNum.append("2");
                    break;
                case "0011":
                    hexNum.append("3");
                    break;
                case "0100":
                    hexNum.append("4");
                    break;
                case "0101":
                    hexNum.append("5");
                    break;
                case "0110":
                    hexNum.append("6");
                    break;
                case "0111":
                    hexNum.append("7");
                    break;
                case "1000":
                    hexNum.append("8");
                    break;
                case "1001":
                    hexNum.append("9");
                    break;
                case "1010":
                    hexNum.append("A");
                    break;
                case "1011":
                    hexNum.append("B");
                    break;
                case "1100":
                    hexNum.append("C");
                    break;
                case "1101":
                    hexNum.append("D");
                    break;
                case "1110":
                    hexNum.append("E");
                    break;
                case "1111":
                    hexNum.append("F");
                    break;

            }
        }
        System.out.println(hexNum);
    }
}
