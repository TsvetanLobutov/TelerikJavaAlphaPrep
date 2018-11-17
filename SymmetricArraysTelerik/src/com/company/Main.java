package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        int k = Integer.parseInt(n);
        // boolean sym = true;

        for (int j = 0; j < k; j++) {

            String data = in.nextLine();
            String tmpDataArray[] = data.split(" ");
            int dataArray[] = new int[tmpDataArray.length];
            for (int i = 0; i < dataArray.length; ++i) {
                dataArray[i] = Integer.parseInt(tmpDataArray[i]);

            }

            for( int i = 0;i < dataArray.length ;i++){
                if(dataArray[i]!= dataArray[dataArray.length - 1- i]){
                    System.out.println("No"); break;}

                    else{
                    System.out.println("Yes");
                    break;
                }
            }




            }




        }

        }





