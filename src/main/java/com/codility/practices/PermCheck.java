package com.codility.practices;

import java.util.Arrays;
import java.util.List;

public class PermCheck {
    /*  [1,3,2,4] --> Permutation return 0
     *  [1,3,4] --> NOT Permutation (missing 2) return 1
     */

    public static void main(String[] args) {
        Integer[] inputArr = {1,5,3,4};
        System.out.print("Input : "+ Arrays.toString(inputArr)+" gives Output : "+getPermCheckVal(inputArr));
    }

    private static int getPermCheckVal(Integer[] inputArr) {
        List<Integer> list = Arrays.asList(inputArr);
        for(int i=1;i<=inputArr.length;i++){
            if(!list.contains(i)){
               return 1;
            }
        }
    return 0;
    }


}
