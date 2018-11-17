package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] parkingSizeInput = reader.readLine().split(" ");

        int parkingWidth = Integer.parseInt(parkingSizeInput[0]);
        int parkingLength = Integer.parseInt(parkingSizeInput[1]);

        final int bigCarSize = 4;

        String[][] parkingConfig = new String[parkingWidth][parkingLength];

        for(int row = 0; row < parkingWidth; row++){
            String inputLine = reader.readLine();

            for(int col = 0; col < parkingLength; col ++){
                parkingConfig[row][col] = String.valueOf(inputLine.charAt(col));
            }
        }

        int[] slotsByCar = new int[5];

        final int[] checkRow = new int[]{0,0,1,1};
        final int[] checkCol = new int[]{0,1,0,1};

        for(int i = 0; i < parkingConfig.length - 1; i++ ){
            for(int j = 0; j < parkingConfig[1].length - 1; j++){
                int cars = 0;
                boolean building = false;

                for(int k = 0; k < bigCarSize; k++){
                    if(parkingConfig[i + checkRow[k]][j + checkCol[k]].equals("#")){
                        building = true;
                        break;
                    }else if(parkingConfig[i + checkRow[k]][j + checkCol[k]].equals("X"))cars++;
                }
                if(!building) slotsByCar[cars]++;
            }
        }
        StringBuilder printout = new StringBuilder();

        for(int i = 0; i < slotsByCar.length; i++){
            printout.append(slotsByCar[i]).append("\n");
        }

        System.out.println(printout);

    }
}
