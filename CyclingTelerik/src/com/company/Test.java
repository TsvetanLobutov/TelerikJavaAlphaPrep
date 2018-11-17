package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int k = Integer.parseInt(n);
        int c = 0;
        int m = 0;
        int r = 0;
        int mt = 0;
        double maxs = 0;
        int d = 0;
        int i = 0;

        for (int j = 1; j <= k; j++){
            String data = in.nextLine();
            String tmpDataArray[] = data.split(" ");
            int dataArray[] = new int[tmpDataArray.length];
            for ( i = 0; i < dataArray.length; ++i) {
                dataArray[i] = Integer.parseInt(tmpDataArray[i]);
                c = dataArray[0];
                m = dataArray[1];
                r = dataArray[2];}

            mt = mt + (60 * c) + m;
            double ms = (double)r / (60 * c + m);
            if(ms > maxs) {maxs = ms; d = j; }



        }

        int d0 = mt / (24*60);
        mt = mt % (24*60);
        int c0 = mt / 60;
        mt = mt % 60;

        System.out.print(d0 + " ");
        System.out.print(c0 + " ");
        System.out.print(mt + " ");
        System.out.println(d + " ");

    }
}