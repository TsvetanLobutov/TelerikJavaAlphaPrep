package com.company;


import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String inpStr = in.nextLine();

      // System.out.println("Original String :" + inpStr);
       char temp;
       char[] arr = inpStr.toCharArray();
       int len = arr.length;
       for(int i=0; i<(inpStr.length())/2; i++,len--){
           temp = arr[i];
           arr[i] = arr[len-1];
           arr[len-1] = temp;
       }

       System.out.println(String.valueOf(arr));


    }
}




