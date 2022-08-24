package com.codility.practices.before;

/*
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9,7] (elements are shifted right by one index and 6 is moved to the first place).
The goal is to rotate array AK times; that is, each element of A will be shifted to the right times.
Write a function:
class Solution { public int[] solution(int[] a, int k); }
that, given an array A consisting of N integers and an integer K, returns the array A rotated K times. For example, given
A = [3, 8, 9, 7, 6]
k = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:
[3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
[6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
[7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicRotation {
    public static void main(String[] args) {
        Integer[] inputArr = {3, 8, 9, 7, 6};
        int K = 3;
        List<Integer> outputArr = getRotatedArr(inputArr, K);
        System.out.println("For input Array "+inputArr+" & K "+K+" the output is "+outputArr);
    }

    private static List<Integer> getRotatedArr(Integer[] inputArr, int k) {
        int arrayLength = inputArr.length;
        List<Integer> outputList = Arrays.asList(inputArr);
        if(arrayLength>0){
            int beginVal = 0;
            int noOfRotations = k%arrayLength;
            System.out.println("No of rotations asked is "+noOfRotations);
            for(int j=0;j<k;j++) {
               outputList = shiftRight(outputList, arrayLength);
            }
        }else{
            System.out.println("Invalid Input");
        }

        return outputList;
    }

    private static List<Integer> shiftRight(List<Integer> inputList, int arrayLength) {
       List<Integer> output = new ArrayList<>();
        output.add(inputList.get(arrayLength-1));
        for (int i = 0; i < arrayLength-1; i++) {
            output.add(inputList.get(i));
        }
        System.out.println(output);
        return output;
    }
}
