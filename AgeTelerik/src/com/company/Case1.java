package com.company;

import java.time.LocalDate;
import java.util.Scanner;


public class Case1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();

        String newString = date.substring(date.length()- 4);

        int dateInt = Integer.parseInt(newString);

        LocalDate a = LocalDate.now();
       // DateTimeFormatter a = DateTimeFormatter.ofPattern("MM.dd.yyyy");

        System.out.println(a.getYear() - dateInt);
        System.out.println((a.getYear() - dateInt) + 10);
    }


}
