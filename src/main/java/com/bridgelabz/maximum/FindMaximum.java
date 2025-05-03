package com.bridgelabz.maximum;

public class FindMaximum {

    public Integer findMaximum(Integer num1,Integer num2,Integer num3){

        Integer max=num1;
        if(num2.compareTo(max)>0){
            max=num2;
        }
        if(num3.compareTo(max)>0){
            max=num3;
        }
        return max;
    }

    public Float findFloatMaximum(Float num1,Float num2,Float num3){

        Float max=num1;
       if(num2.compareTo(max)>0){
           max=num2;
       }
       if(num3.compareTo(max)>0){
           max=num3;
       }
        return max;
    }
}
