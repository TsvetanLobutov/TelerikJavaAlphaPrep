package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Integer[] numbers = new Integer[n];

        // We need a copy of the array
        //  for the algorithm
        Integer[] numbersToSort = new Integer[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
            numbersToSort[i] = numbers[i];
        }

        // Sort the numbers, so we can find their position later
        //  reverse order, so the position is the correct one
        //  without complex formulas
        // Example:
        //  numbers: 4 1 2 3
        //  result: 1 4 3 2
        //  numbersToSort: 4 3 2 1
        //  index of 4 in sorted: 0
        //  index of 1 in sorted: 3
        //  index of 2 in sorted: 2
        //  index of 3 in sorted: 1
        //  if we add 1 to the indices, we get the result
        Arrays.sort(numbersToSort, Comparator.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            int index = 0;

            // Find the index in the sorted array
            for (int j = 0; j < numbersToSort.length; j++) {
                if (numbersToSort[j].equals(numbers[i])) {
                    index = j;
                    break;
                }
            }

            // The result is the index + 1,
            //  as explained above
            numbers[i] = index + 1;
        }

        // Just print the numbers
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
    }
}

