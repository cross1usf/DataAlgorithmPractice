package com.company.Arrays;

public class MaximumProductInArray {


    public void maximumProduct(int [] array){
        int maximumValue = 0; //Stores the maximum value for us.

        for (int i = 0; i< array.length; i++){

            for(int j = i+1; j< array.length; j++){
                int product = array[i] * array[j];
                //Is the product greater than the maximum value? If yes, maximumValue = product.
                maximumValue = product>maximumValue? product:maximumValue;
            }
        }
        System.out.println("The maximum product among the Integers is " + maximumValue );

    }

}
