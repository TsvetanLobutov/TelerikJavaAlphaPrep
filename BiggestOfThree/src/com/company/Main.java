package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double firstNum = in.nextDouble();
        double secondNum = in.nextDouble();
        double thirdNum = in.nextDouble();

        if(firstNum > secondNum && firstNum > thirdNum){
            System.out.println(firstNum);
        }else if(secondNum > firstNum && secondNum > thirdNum){
            System.out.println(secondNum);
        }else if(thirdNum > firstNum && thirdNum > secondNum){
            System.out.println(thirdNum);
        }else if(firstNum == secondNum) {
            System.out.println(firstNum);
        }
    }

}
