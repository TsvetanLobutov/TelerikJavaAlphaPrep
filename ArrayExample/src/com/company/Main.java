package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] names = new String[n];
        for(int i = 0; i < names.length; i++){
            names[i] = in.nextLine();
        }

        while(true){
            String command = in.next();
            if(command.equals("end")){
                break;
            }

            int index = Integer.parseInt(command);
            if(index < 0 || index >= n){
                System.out.println("Invalid name number");
                continue;
            }
            System.out.println(names[n - 1]);
        }
    }
}
