package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int br = 0;
        int max = 0;
        char[] size = s.toCharArray();

        for(int i = 0; i < s.length(); i++){


            if (!(size[i] >= 'A' && size[i] <= 'Z') && !(size[i] >= 'a' && size[i] <= 'z') && !(size[i] >= '0' && size[i] <= '9') && size[i] != ' ' && size[i] != '.') {
                br++;
            }
            else {
                if (br > max) max = br;
                br = 0;
            }

        }

        if(br >= max) max = br;
        System.out.println(max);
        }

}

