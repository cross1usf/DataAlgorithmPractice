package com.company.Arrays;

import java.util.ArrayList;
import java.util.List;

public class TargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0;i<nums.length;i++){

            list.add(index[i], nums[i]);
        }
        System.out.println(list);
        int[] target = new int[list.size()];

        int in = 0;

        for (int val: list){

            target[in++] = val;
        }
        return target;
    }


}
