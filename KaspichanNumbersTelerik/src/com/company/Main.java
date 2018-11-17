package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<String> letters = new ArrayList<>();

        for(char ch = 'A'; ch <= 'Z'; ch++){
            letters.add(Character.toString(ch));
        }
        for(char i = 'a'; i < 'i'; i++){
            for(char j = 'A'; j <= 'Z';j++){
                letters.add(Character.toString(i) + Character.toString(j));
                if(letters.size() == 256)break;
            }
        }
        String result = "";
        if(n == 0){
            result = "A";
        }
        while (n > 0){
            result = letters[(int)(n % 256)] + result;
        }
        System.out.println(result);


    }

}
