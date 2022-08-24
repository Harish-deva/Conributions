package com.codility.practices.before;

/*
*

A non-empty zero-indexed array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P < Q < N, is called a slice of array A (notice that the slice contains at least two elements). The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice. To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
For example, array A such that:

A[0] = 4
A[1] = 2
A[2] = 2
A[3] = 5
A[4] = 1
A[5] = 5
A[6] = 8

contains the following example slices:

    slice (1, 2), whose average is (2 + 2) / 2 = 2;
    slice (3, 4), whose average is (5 + 1) / 2 = 3;
    slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.

The goal is to find the starting position of a slice whose average is minimal.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A consisting of N integers, returns the starting position of the slice with the minimal average. If there is more than one slice with a minimal average, you should return the smallest starting position of such a slice.
For example, given array A such that:

A[0] = 4
A[1] = 2
A[2] = 2
A[3] = 5
A[4] = 1
A[5] = 5
A[6] = 8

the function should return 1, as explained above.

Assume that:

    N is an integer within the range [2..100,000];
    each element of array A is an integer within the range [−10,000..10,000].

Complexity:

    expected worst-case time complexity is O(N);
    expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.


* */

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MinAvgSubSequence {

    private static Map<String,Integer> cachedMap = new HashMap<>();

    public static void main(String[] args) {
        int[] inputArr = {4,2,2,5,1,5,8};
        System.out.println("Minimum Average = "+getMinAvgSeq (inputArr));
    }

    private static int getMinAvgSeq(int[] inputArr) {
        int minValue = Integer.MAX_VALUE;
        AtomicInteger diff = new AtomicInteger(2);
        for(int i=0;i<inputArr.length;i++){
            //Case 1
            //Q-P+1 = 2
            int difference = diff.get();
            for(int j=0,k=difference-1;k<inputArr.length;j++,k++){
                int avgValue = getAvg(inputArr,j,k,difference);
                minValue = minValue < avgValue? minValue:avgValue;
            }
            diff.getAndIncrement();
        }
        cachedMap.forEach((k,v)-> System.out.println(k+","+v));
        return minValue;
    }

    private static int getAvg(int[] inputArr, int j, int k, int diff) {
        String inputParams = j+","+k+","+diff;
        if(cachedMap.containsKey(inputParams)){
            return cachedMap.get(inputParams);
        }
        int sum = 0,average = 0;
        for(int i=j;i<=k;i++){
          sum += inputArr[i];
        }
        average = sum/diff;
        cachedMap.put(inputParams,average);
        return average;
    }
}
