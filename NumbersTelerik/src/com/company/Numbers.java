package com.company;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numberAsString = "";
        String input = in.nextLine();
        while (!input.equals("end")) {
            String[] inputElements = input.split(" ");

            switch (inputElements[0]) {
                case "set":
                    numberAsString = inputElements[1];
                    break;
                case "front-add":
                    numberAsString = inputElements[1] + numberAsString;
                    break;
                case "front-remove":
                    if (numberAsString.length() > 1)
                        numberAsString = numberAsString.substring(1);
                    else numberAsString = "";
                    break;
                case "back-add":
                    numberAsString = numberAsString + inputElements[1];
                    break;
                case "back-remove":
                    if (numberAsString.length() > 1)
                        numberAsString = numberAsString.substring(0, numberAsString.length() - 1);
                    else numberAsString = "";
                    break;
                case "reverse":
                    if (numberAsString.length() != 0)
                        numberAsString = new StringBuilder(numberAsString).reverse().toString();
                    break;
                case "print":
                    System.out.println(numberAsString);
                    break;
            }

            input = in.nextLine();
        }
    }
}
