package com.bridgelabz.maximum;

public class FindMaximum {

    // This Method is used to find the String Maximum
    public String findStringMaximum(String s1,String s2,String s3){
        String max=s1;
        if(s2.compareTo(max)>0){
            max=s2;
        }
        if(s3.compareTo(max)>0){
            max=s3;
        }
        return max;
    }
}
