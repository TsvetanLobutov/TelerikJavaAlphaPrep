package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

       // int m = 0;

        int A10 = 1;
        int A9 = 2;
        int A8 = 4;
        int A7 = 8;
        int A6 = 16;
        int A5 = 32;
        int A4 = 64;
        int A3 = 128;
        int A2 = 256;
        int A1 = 512;
        int A0 = 1024;

        ArrayList<String> arr = new ArrayList<>();

        arr.add("A0");arr.add("A1");arr.add("A2");arr.add("A3");arr.add("A4");arr.add("A5");arr.add("A6");
        arr.add("A7");arr.add("A8");arr.add("A9");arr.add("A10");

        while(n > 0) {

            if (n >= A0) {
                n = n - A0;
                arr.remove("A0");
            }else if(n >= A1){
                n = n - A1;
                arr.remove("A1");
            }else if(n >= A2){
                n = n - A2;
                arr.remove("A2");
            }else if(n >= A3){
                n = n - A3;
                arr.remove("A3");
            }else if(n >= A4){
                n = n - A4;
                arr.remove("A4");
            }else if(n >= A5){
                n = n - A5;
                arr.remove("A5");
            }else if(n >= A6){
                n = n - A6;
                arr.remove("A6");
            }else if(n >= A7){
                n = n - A7;
                arr.remove("A7");
            }else if(n >= A8){
                n = n - A8;
                arr.remove("A8");
            }else if(n >= A9){
                n = n - A9;
                arr.remove("A9");
            }else if(n >= A10){
                n = n - A1;
                arr.remove("A10");
            }



        }



        for (String d : arr ){
            System.out.println(d);
        }

    }
}
