package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char a ;
        char b ;
        char c ;
        char d ;
        int br1 = 0;
        int br2 = 0;

        char array[] = new String(n).toCharArray();

        a = array[0];
        b = array[1];
        c = array[2];
        d = array[3];

        if(a=='a'||a=='o'||a=='e'||a=='i'||a=='u'||a=='y'){
            br1++;
        }else{br2 ++;}
        if(b=='a'||b=='o'||b=='e'||b=='i'||b=='u'||b=='y'){
            br1++;
        }else{br2 ++;}
        if(c=='a'||c=='o'||c=='e'||c=='i'||c=='u'||c=='y'){
            br1++;
        }else{br2 ++;}
        if(d=='a'||d=='o'||d=='e'||d=='i'||d=='u'||d=='y'){
            br1++;
        }else{br2 ++;}

        if(br1 == br2){
            System.out.println("Yes");
        }else{
            System.out.println(br1 + " " +br2);
        }
    }
}
