package com.codility.practices.before;

import java.util.ArrayList;
import java.util.List;

public class OddOccurrencesInArray {

    /*
    A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
For example, in array A such that:
A[0] = 9 A[3] = 3 A[6] = 9
A[1] = 3 A[4] = 9
A[2] = 9 A[5] = 7
the elements at indexes 0 and 2 have value 9, the elements at indexes 1 and 3 have value 3, the elements at indexes 4 and 6 have value 9, the element at index 5 has value 7 and is unpaired.
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
     */


    public static void main(String[] args) {
        int[] input = {9,3,9,3,9,7,9};
        System.out.println("The Odd occurrence is "+solution1(input));
    }

    public static int solution1(int[] A){
        List<Integer> oddOccurrence = new ArrayList<>();
        for (int i : A){
            if(oddOccurrence.contains(i)){
                oddOccurrence.remove(Integer.valueOf(i));
            }else{
                oddOccurrence.add(i);
            }
        }
        return oddOccurrence.get(0);
    }



}
