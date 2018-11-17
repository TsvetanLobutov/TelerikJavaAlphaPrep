package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String data = in.nextLine();
        String tmpDataArray[] = data.split(" ");
        int dataArray[] = new int[tmpDataArray.length];
        for (int i = 0; i < dataArray.length; ++i) {
            dataArray[i] = Integer.parseInt(tmpDataArray[i]);
        }

        for (int j = 0; j < dataArray.length; j++) {
            if (dataArray[j] % 3 == 0) {
                System.out.print(dataArray[j] + " ");
                }
        }System.out.println();
        for (int j = 0; j < dataArray.length; j++) {
            if (dataArray[j] % 3 == 1) {
                System.out.print(dataArray[j] + " ");
                }
            } System.out.println();
        for (int j = 0; j < dataArray.length; j++) {
            if (dataArray[j] % 3 == 2) {
                System.out.print(dataArray[j] + " ");
                }
        }
    }
}
