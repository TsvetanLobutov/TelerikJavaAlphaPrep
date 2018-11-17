package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> operations = new ArrayList<String>();

        while (true) {

            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            operations.add(input);

        }

        for (String cell : operations) {

            String operation = cell.replaceAll(" \\d", "");
            String operand = cell.replaceAll("\\D", "");
            String number = "";
            System.out.println(operation);

        }

    }

}
