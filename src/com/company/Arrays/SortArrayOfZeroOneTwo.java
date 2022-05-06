package com.company.Arrays;

import java.util.Arrays;

public class SortArrayOfZeroOneTwo {

    private static void swap(int [] A, int i, int j){
        //Java does not have an easy swap method? I am surprised!, so we make one ourselves!
        int storage = A[i];
        A[i] = A[j];
        A[j] = storage;
    }

    public void sortArrayOfOneAndTwo(int[] array) {
        int count = 0;
        int one = 1;
        int ZerosPlace = 0;
        int twoPlace = array.length-1;

        while(count < array.length-1){

            if(array[count] < one){
                swap(array,ZerosPlace, count);
                ZerosPlace++;
                count++;
            }
             if(array[count] > one && count < twoPlace){
                swap(array,count,twoPlace);
                twoPlace--;
            }else{
                 count++;
             }


        }
        System.out.println(Arrays.toString(array));
        }





    }

