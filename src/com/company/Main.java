package com.company;

import com.company.Arrays.*;

import java.util.HashSet;
import java.util.Set;

public class Main {


        public static void main (String[]args){
            int[] array = {0, 1,1, 0, 0,9, 5};
            int target = 3;

           LargestSubArrayBinary largestSubArrayBinary = new LargestSubArrayBinary();
          largestSubArrayBinary.findLargestSubArray(array);
        }

    }

