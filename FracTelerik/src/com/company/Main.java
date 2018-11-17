package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;


        String data = in.nextLine();
        String tmpDataArray[] = data.split(" ");
        int dataArray[] = new int[tmpDataArray.length];
        for (int i = 0; i < dataArray.length; ++i) {
            dataArray[i] = Integer.parseInt(tmpDataArray[i]);
            a = dataArray[0];
            b = dataArray[1];
        }


        for( int d = 2; d < 500; d++)
            while( a % d == 0 && b % d == 0)
            {
                a = a / d;
                b = b / d;
            }
        System.out.println(a + " " + b);

    }
}
