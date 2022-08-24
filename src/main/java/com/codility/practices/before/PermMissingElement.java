package com.codility.practices.before;

import java.util.Arrays;

public class PermMissingElement {

    /*
    An array A consisting of N different integers is given.
    The array contains integers in the range (1..(N + 1)],
    which means that exactly one element is missing.
Your goal is to find that missing element.
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A, returns the value of the missing element.
For example, given array A such that:
A[0] = 2
A[1] = 3
A[2] = 1
A[3] = 5
the function should return 4, as it is the missing element.
Write an efficient algorithm for the following assumptions:
N is an integer within the range (0..100,000);
     */

    public static void main(String[] args) {
        int[] inputNumbers  = {2,1,3,5};
        System.out.println("Output : "+solution(inputNumbers));
    }

    public static int solution(int[] A){
        Arrays.sort(A);
        for(int i=0;i<=A.length-1; i++){
            if(A[i] != i+1){
                return i+1;
            }
        }
        return 0;
    }
}
