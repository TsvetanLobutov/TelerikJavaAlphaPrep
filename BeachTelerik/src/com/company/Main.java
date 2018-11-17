package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int h3 = in.nextInt();
        int m3 = in.nextInt();
        int h4 = in.nextInt();
        int m4 = in.nextInt();

        int x1 = h1*60+m1;
        int y1 = h2*60+m2;
        int x2 = h3*60+m3;
        int y2 = h4*60+m4;

        if( y1 < x2 || y2 < x1){
            System.out.print("No");
        }else if(x1 >= x2 && y2 >= y1){
            int hours = x1 / 60;
            int minutes = x1 % 60;
            System.out.print(hours + " " + minutes + " ");

            int hours2 = y1 / 60;
            int minutes2 = y1 % 60;
            System.out.print(hours2 + " " + minutes2);


        }else if(x1 >= x2 && y1 >= y2 ){
            int hours = x1 / 60;
            int minutes = x1 % 60;
            System.out.print(hours + " " + minutes + " ");

            int hours2 = y2 / 60;
            int minutes2 = y2 % 60;
            System.out.print(hours2 + " " + minutes2);

        }else if(x1 <= x2 && y1 >= y2 ) {
            int hours = x2 / 60;
            int minutes = x2 % 60;
            System.out.print(hours + " " + minutes + " ");

            int hours2 = y2 / 60;
            int minutes2 = y2 % 60;
            System.out.print(hours2 + " " + minutes2);

        }else if(x1 <= x2 && y1 <= y2 ) {
            int hours = x2 / 60;
            int minutes = x2 % 60;
            System.out.print(hours + " " + minutes + " ");

            int hours2 = y1 / 60;
            int minutes2 = y1 % 60;
            System.out.print(hours2 + " " + minutes2);

        }
    }
}
