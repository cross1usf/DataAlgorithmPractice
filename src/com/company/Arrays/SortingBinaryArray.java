package com.company.Arrays;

public class SortingBinaryArray {

    public void SortBinary(int[] array) {
        int k = 0;

        for (int value : array) {
            if (value == 0) {
                array[k] = 0;
                k++;
            }
        }
        for (int i = k; i < array.length; i++) {
            array[k] = 1;
            k++;
        }

    }
}
