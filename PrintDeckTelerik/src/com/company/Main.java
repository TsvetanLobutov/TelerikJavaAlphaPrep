package com.company;

import java.util.*;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        ArrayList<String> cards = new ArrayList<String>();

        switch (n) {
            case "A":
                cards.add("A of spades, A of clubs, A of hearts, A of diamonds ");
            case "K":
                cards.add("K of spades, K of clubs, K of hearts, K of diamonds ");
            case "Q":
                cards.add("Q of spades, Q of clubs, Q of hearts, Q of diamonds ");
            case "J":
                cards.add("J of spades, J of clubs, J of hearts, J of diamonds ");
            case "10":
                cards.add("10 of spades, 10 of clubs, 10 of hearts, 10 of diamonds ");
            case "9":
                cards.add("9 of spades, 9 of clubs, 9 of hearts, 9 of diamonds ");
            case "8":
                cards.add("8 of spades, 8 of clubs, 8 of hearts, 8 of diamonds ");
            case "7":
                cards.add("7 of spades, 7 of clubs, 7 of hearts, 7 of diamonds ");
            case "6":
                cards.add("6 of spades, 6 of clubs, 6 of hearts, 6 of diamonds ");
            case "5":
                cards.add("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds ");
            case "4":
                cards.add("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds ");
            case "3":
                cards.add("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds ");
            case "2":
                cards.add("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds ");
                break;
            default:
                break;
        }
        //for (String nname : cards) {

            //System.out.println(nname);

          //  }
        for (int i = cards.size() - 1; i >= 0 ; i--) {
            System.out.println(cards.get(i));
        }


        }
        }



