package com.company.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class GreatNumberOfCandy {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Integer max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> stuff = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                stuff.add(true);
            } else{
                stuff.add(false);
        }
        } return stuff;
    }


    public void candy(int[] candies) {
        Integer max = Arrays.stream(candies).max().getAsInt();
        System.out.println(max);
    }



}
