package com.cydeo;

import java.util.*;

public class Array_of_Digits {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayOfDigits(490)));
        System.out.println(Arrays.toString(arrayOfDigits(-597986875)));
        System.out.println(Arrays.toString(arrayOfDigits(0)));

    }
    public static int[] arrayOfDigits(int n){
        if (n==0)
           return new int[]{n};
        if (n<0){
            System.out.print("- ");
            n=-n;
        }

        Deque<Integer> deque = new ArrayDeque<>();

        while (n>0){
            deque.push(n%10);
            n=n/10;
        }

        return deque.stream().mapToInt(i -> i).toArray();
    }
}
