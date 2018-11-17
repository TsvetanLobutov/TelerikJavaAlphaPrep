package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class BusExcursion {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]  busSizeInput = reader.readLine().split(" ");

        final int busWidth = Integer.parseInt(busSizeInput[0]);
        final int busHeigth = Integer.parseInt(busSizeInput[1]);

        final int numberOfTunnels = Integer.parseInt(reader.readLine());

        boolean isCrashed = false;

        int counter;

        for(counter = 1; counter <= numberOfTunnels; counter++) {

            String[] input = reader.readLine().split(" ");
            int tunnelWigth = Integer.parseInt(input[0]);
            int tunnelHeigth = Integer.parseInt(input[1]);

            if (busWidth > tunnelWigth || busHeigth > tunnelHeigth) {
                isCrashed = true;
                break;
            }
        }
        System.out.println(isCrashed ? counter : "No crash");

    }
}
