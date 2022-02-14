package com.codility.practices;

import java.util.Arrays;
import java.util.HashSet;

public class Model {

    /*
     * Array[N] input ==>smallest natural no.  <  any distinct num in array
     * eg. [-1,-4] == 1; [1, 3, 6, 4, 1, 2] = 5; [1, 2, 3] = 4
     */
    public static void main(String[] args) {
        Model to = new Model();
        int[] input = {1, 2, 3};
        System.out.println("Input : "+ Arrays.toString(input)+"Output : "+to.solution(input));
    }

    private int solution(int[] A) {
        int sol = 1;
        HashSet arrayVals = new HashSet<Integer>();
        for(int temp : A){
            arrayVals.add(temp);
        }
        for (int i =1;i<=A.length+1; i++){
           if(!arrayVals.contains(i)){
               return i;
           }
        }
        return sol;
    }

}
