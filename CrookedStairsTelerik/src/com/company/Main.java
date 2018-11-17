package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> bricks = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            bricks.add(in.nextLong());
        }
        int stairs = in.nextInt();
        int bricksNum= calcBricks(stairs);

        for(int i = 2; i < bricksNum; i++){
            bricks.add(bricks.get(bricks.size() - 1) + bricks.get(bricks.size() - 2) + bricks.get(bricks.size() -3));
        }
        int index = 0;
        for(int i = 1; i < stairs + 1;i++ ){
            for(int j = 0; j < i; j++){
                if(i == j - 1){
                    System.out.print(bricks.get(index));
                }else{
                    System.out.print(bricks.get(index) + " ");
                }
                index++;
            }
            System.out.println();
        }

    }
    public static int calcBricks(int num){
        int result = 0;
        for(int i = 0; i < num + 1; i++){
            result  += i;
        }
        return result;
    }
}
