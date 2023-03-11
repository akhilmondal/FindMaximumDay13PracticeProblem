package com.generics.findmax;

public class FindMaximum<T extends Comparable> {
    /*Inheriting Comparable class.
     so that we can compare our generics variables
     */

    public T findMax(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }
    //    Passing Integer data type through generics
    public static void main(String[] args) {
        System.out.println("Welcome to the Test max Number using Generics!");
        FindMaximum<Integer> max = new FindMaximum();  //Creating object with Integer generics.
        System.out.println("Maximum number: " + max.findMax(40, 30, 10));
        System.out.println("Maximum number: " + max.findMax(40, 20, 50));
        System.out.println("Maximum number: " + max.findMax(50, 40, 30));
    }
}
