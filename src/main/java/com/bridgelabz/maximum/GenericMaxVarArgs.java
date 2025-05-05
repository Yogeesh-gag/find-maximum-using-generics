package com.bridgelabz.maximum;

import java.util.*;

public class GenericMaxVarArgs {

    //UC-4 Generic method with Varargs+sorting
    public static <T extends Comparable<T>> T testMaximum(T... elements){
        if(elements == null || elements.length == 0){
            throw new IllegalArgumentException("At least one element is required");
        }

        List<T> list= Arrays.asList(elements);
        Collections.sort(list); //Sorting in ascending order
        T max=list.get(list.size()-1); //Last element is the max

        //Calling static method
        printMax(max);

        return max;
    }

    //UC5-Generic print Method
    public static <T> void printMax(T max){
        System.out.println("The maximum value is "+max);
    }
}
