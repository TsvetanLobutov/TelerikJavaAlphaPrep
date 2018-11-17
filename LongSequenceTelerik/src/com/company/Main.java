package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i = 2; i < 1000; i++){

            if(i % 2 == 0){
                System.out.println(i);
            }else{
                System.out.println("-" + i);
            }

        }

    }
}
