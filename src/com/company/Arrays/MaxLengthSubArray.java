package com.company.Arrays;

import java.util.HashSet;
import java.util.Set;

public class MaxLengthSubArray {

    public static void maxLengthSubArray(int[] array, int target) {

        int length = 0; //Stores the length of the longest Sub-array.
        int endingIndex = 0; //Stores the Last index, so we know what to print out.

        for (int i = 0; i < array.length; i++) {
            //First we start at the first Index, then second, then third.
            int sum = 0; // MUST STORE HERE TO RESET SUM AFTER EACH ITERATION THROUGH.
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if(sum == target && (j-i+1 > length)){ // Don't forget the plus one, it's included in the total.
                    length = j-i+1;
                    endingIndex = j;
                }
            }
            System.out.println("["+(endingIndex-length+1) + "," + endingIndex + "]");
        }
    }
}


