package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();



        String[] monthString = new  String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


        if( day == 1 && month == 5 || day == 1 && month == 7
                ||day == 1 && month == 10|| day == 1 && month == 12 || day == 1 && month == 8 ){
            month = month - 2;
            System.out.println(30 + "-" + monthString[month] + "-" + year);}
        else if(day == 1 && month == 0 ){
            month = 11;
            year = year - 1;
            System.out.println(31 + "-" + monthString[month] + "-" + year);
        }
        else if(day == 1 && month == 3){
            if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)){
                month = month - 2;
                System.out.println(29 + "-" + monthString[month] + "-" + year);}

            else{
                month = month - 2;
            System.out.println(28 + "-" + monthString[month] + "-" + year);}

        }else if(day == 1 && month == 4 || day == 1 && month == 6
                ||day == 1 && month == 9|| day == 1 && month == 11){
            month = month - 2;
            System.out.println(31 + "-" + monthString[month] + "-" + year);}
            else if(day == 1 && month == 1){
            month = 11;
            year = year - 1;
            System.out.println(31 + "-" + monthString[month] + "-" + year);

        }
        else{

            month = month - 1;
            System.out.println(day - 1 + "-" + monthString[month] +"-"+ year);}

    }
}

