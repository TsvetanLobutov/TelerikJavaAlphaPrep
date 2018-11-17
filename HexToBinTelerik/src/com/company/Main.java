package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String p="";
        long n=0;
        int c=0;

        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)=='A') {
                n=n+(long)(Math.pow(16,c)*10);
                c++;
            }
            else if(s.charAt(i)=='B') {
                n=n+(long)(Math.pow(16,c)*11);
                c++;
            }
            else if(s.charAt(i)=='C') {
                n=n+(long)(Math.pow(16,c)*12);
                c++;
            }
            else if(s.charAt(i)=='D'){
                n=n+(long)(Math.pow(16,c)*13);
                c++;
            }
            else if(s.charAt(i)=='E') {
                n=n+(long)(Math.pow(16,c)*14);
                c++;
            }
            else if(s.charAt(i)=='F') {
                n=n+(long)(Math.pow(16,c)*15);
                c++;
            }
            else{
                n=n+(long)Math.pow(16,c)*(long)s.charAt(i);
                c++;
            }
        }
        String s1="",k="";
        if(n>1){
            while(n>0)
            {
                if(n%2==0){
                    k=k+"0";
                    n=n/2;
                }
                else {
                    k=k+"1";
                    n=n/2;
                }
            }
            for(int i=0;i<k.length();i++) {
                s1=k.charAt(i)+s1;
            }
            System.out.println(s1);
        } else {
            System.out.println(n);
        }
    }
}
