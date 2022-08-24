package com.codility.practices.before;

import java.util.LinkedList;
import java.util.List;

public class PermutationCheck {

    public static void main(String[] args) {
        int[] input = {2,1,4,5};
        System.out.println("Given array is "+(solution(input)?"":"NOT")+" a permutation");
    }

    private static boolean solution(int[] A) {
        int arrayLen = A.length;
        List<Integer> realPermutation = new LinkedList<Integer>();
        for(int i=1;i<=arrayLen;i++){
            realPermutation.add(i);
        }
        for(int j : A){
            if(realPermutation.remove(Integer.valueOf(j))){

            }else{
                return false;
            }
        }
        return true;
    }
}
