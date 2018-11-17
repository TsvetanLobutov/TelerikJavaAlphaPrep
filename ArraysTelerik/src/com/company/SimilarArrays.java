package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimilarArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int firstArrayLength = in.nextInt();
        ArrayList<Integer> differences = new ArrayList<>();
        ArrayList<Integer> firstArray = new ArrayList<Integer>();

        for(int i = 0; i < firstArrayLength; i++){
            firstArray.add(in.nextInt());
        }
        int secondArrayLength = in.nextInt();
        ArrayList<Integer> secondArray = new ArrayList<Integer>();
        for (int i = 0; i < secondArrayLength; i++) {
            secondArray.add(in.nextInt());
        }
        List<Integer> firstArrayWithoutDuplicates = firstArray.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        List<Integer> secondArrayWithoutDuplicates = secondArray.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i <firstArrayWithoutDuplicates.size() ; i++) {
            if (secondArrayWithoutDuplicates.contains(firstArrayWithoutDuplicates.get(i))){
                counter++;
            }
            else {
                differences.add(firstArrayWithoutDuplicates.get(i));
            }

        }
        if (firstArrayWithoutDuplicates.size()==counter){
            System.out.println(counter);
        }else {
            for (int i: differences) {
                System.out.print(i+" ");

            }
//            System.out.println();
//            System.out.println(differences.toString().replace("[", "").replace(",","").replace("]", ""));
        }

    }

}
