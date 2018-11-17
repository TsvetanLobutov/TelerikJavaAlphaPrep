package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int p1 = 0;
        int p2 = 0;
        int br = 0;
        int x =0;
        int c = 0;

        String data = in.nextLine();
        String tmpDataArray[] = data.split(" ");
        int dataArray[] = new int[tmpDataArray.length];
        for (int i = 0; i < dataArray.length; ++i) {
            dataArray[i] = Integer.parseInt(tmpDataArray[i]);
            a = dataArray[0];
            b = dataArray[1];
            p1 = dataArray[2];
            p2 = dataArray[3];
        }

        for(int j = a; j <= b; j++){

            x = j;
            while (x != 0)
            {
                c = x % 10;
                if (c % p1 != 0 && c % p2!= 0) br++;
                x = x / 10;
            }

            }
        System.out.println(br);
        }


    }

