package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        String m = in.nextLine();
        String c = in.nextLine();



       while(!command.equals("end")) {
           if (command.equals("set " + c)){
               System.out.println();
           }else if(command.equals("front-add " + m)){
               c = m + c;
           }else if(command.equals("front-remove ")){
                c = c.replaceAll(m,"");
           }else  if(command.equals("back-add" + m)){
               c = c + m;
           }else if(command.equals("back-remove")){
               c = c.replaceAll("",m);
           }else if(command.equals("print")){
               System.out.println(c);
           }



       }

    }
}