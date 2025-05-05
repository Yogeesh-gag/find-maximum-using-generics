package com.bridgelabz.maximum;

public class GenericMaxRefactor<T extends Comparable<T>> {

    T x,y,z;

    public GenericMaxRefactor(T x,T y,T z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public T testMaximum(){
        return GenericMaxRefactor.testMaximum(x,y,z);
    }

    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        printMax(max);
        return max;
    }

    public static <T> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }
}
