package com.company.Arrays;

public class PairWithGivenSum {


    public void pairWithSum(int[] array, int target) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("Pair found (" + array[i] + "," + array[j] + ")");
                    return;
                }
            }
        }
            System.out.println("No pair found");
    }
}
