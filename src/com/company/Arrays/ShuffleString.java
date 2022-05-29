package com.company.Arrays;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {


        int count = 0;
        char temp[] = new char[indices.length];
        while (count < indices.length) {
            temp[indices[count]] = s.charAt(count);
            count++;
        } return new String(temp);

    }

}



