package com.company.Arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZero {

    public static Boolean subArrayWithSumZero(int[] array) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
         set.add(0);
        for (int i = 0; i<array.length; i++) {
            sum = sum + array[i];
            if (set.contains(sum)) {
                System.out.println(set);
                return true;
            }
            set.add(sum);
        }
        return false;

    }
}