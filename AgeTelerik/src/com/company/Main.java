package com.company;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;



public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();

        DateTimeFormatter pdate = DateTimeFormatter.ofPattern("MM.dd.yyyy");


        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, pdate);
        // current date

        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(localDate, now);

        System.out.println(diff.getYears());
        System.out.println(diff.getYears() + 10);

    }

}
