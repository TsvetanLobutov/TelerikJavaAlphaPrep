package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(new Integer[] {1, 2, 3});
        do {
            System.out.println(a);
        } while (nextPerm(a));
    }
    public static boolean nextPerm(List<Integer> a) {
        int i = a.size() - 2;
        while (i >= 0 && a.get(i) >= a.get(i + 1))
            i--;

        if (i < 0)
            return false;

        int j = a.size() - 1;
        while (a.get(i) >= a.get(j))
            j--;

        Collections.swap(a, i, j);
        Collections.reverse(a.subList(i + 1, a.size()));
        return true;
    }
}

