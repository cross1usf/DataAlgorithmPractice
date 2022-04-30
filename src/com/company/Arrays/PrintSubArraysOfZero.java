package com.company.Arrays;

public class PrintSubArraysOfZero {

    public void printSubArraysWithSumZero(int[] array){
        /*Will be comparing each index of the array to the others, therefore we will need a loop inside of
        * a loop. Otherwise, we would only be comparing the value in the 0 placeholder to the others, but we would
        * not be able to compare say array[2] with array[4]*/
        for(int i = 0; i < array.length; i++){
            int sum = 0;

            /*This second loop allows us to compare*/
            for(int j = i; j < array.length; j++){
                sum += array[j];
            }if(sum == 0){
                System.out.println("Sub array exists!");
            }
        }
    }
}
