package com.company.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>(nums.length); // Does not allow duplicate
        for(int i : nums){
            if(!hashSet.add(i)){
                return true;
            }
        } return false;
    }
}
