package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        String s = "";
        for (int g: arr)
            s += g;
        char[] c = s.toCharArray();



//        System.out.println(c);
       // int i = 0;

     //  for( int i = 0; i < c.length; i++ ) {
            while (c[0] != c[c.length  - 1] || c[0] ==  '0' || c[c.length  - 1] == '0' ){
                char[] c1 = Arrays.copyOfRange(c, 1, c.length - 1);
                c = c1;

                //System.out.println(c);
            }

      // }
        System.out.println(c);



    }
}
