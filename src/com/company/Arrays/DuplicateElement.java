package com.company.Arrays;

public class DuplicateElement {

    public void duplicateElement(int [] array){
        for( int i: array){
            for (int j = i+1; j<array.length; j++){
                if(array[i] == array[j]){
                    System.out.println("The duplicate element is " + array[i]);
                    return;
                }
            }
        }
    }
}
