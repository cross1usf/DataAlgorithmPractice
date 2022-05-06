package com.company.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayBinary {


    public void findLargestSubArray(int[] array) {
        /*Plan here is to add -1 when a zero appears and 1 when a 1 appears. This will tell us when there is an equal
        amount of 0s and 1s because the sum would be 0. When the sum is 0 we can then compare it to the longest
        existing sub-array to see if we should store it as our longest.*/


        int length = 0; // Stores length of the largest sub array.
        int ending_index = 0; //Will use this to store last index, so we can do something like j-i+1.
        int beginning_index=0; //Need to know where lasting SubArray starts!

        for(int i = 0; i< array.length; i++){
            //Need a loop inside a loop otherwise we can only compare index 0 to the others.
            int sum = 0; //This needs to be inside the loop to reset after our second one makes it all the way through.

            for(int j =i+1; j<= array.length; j++){
                sum += array[j] ==0 ? -1: 1;
                /*If the element equals 0, return -1. Otherwise, return 1. This is a quicker if, else statement.
                * Helps if you read it as, 'Does the array element = 0? If yes, -1.*/
                if(sum == 0 && j-i+1 > length){
                    length = j-i+1;
                    ending_index = j;
                    beginning_index = i;
            }

            }

        }  System.out.println("The Largest subArray with equal amount of 0s and 1's is from" + " [" + (beginning_index) + ", " +
                ending_index + "]");

    }
}
