package com.company.Arrays;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int count = 0;
        while (count < ans.length) {
            for (int i = 0; i < nums.length; i++) {
                ans[count] = nums[i];
                if (i == nums.length - 1) {
                    i = -1;
                }
                count++;
                if(count == ans.length){
                    return ans;
                }
            }
        }
        return ans;
    }
}