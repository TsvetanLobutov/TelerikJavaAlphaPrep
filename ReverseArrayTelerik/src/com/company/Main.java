package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while(in.hasNextInt()){  /// This will loop untill you enter any non integer value
            arr.add(in.nextInt());
        }

        System.out.println(arr);

        Collections.reverse(arr);

        System.out.println(arr);

    }
}
