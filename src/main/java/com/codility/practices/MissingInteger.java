package com.codility.practices;

import java.util.Arrays;
import java.util.HashSet;

public class MissingInteger {

    /* Description
    * given N {0..100000}, int[] A = {1..N+1}
    * find the 1 missing element.
    * eg. {5,3,1,2} => 4
     */

    public static void main(String[] args) {
        int[] A = {2};
        System.out.println("For input "+ Arrays.toString(A)+" the output is "+solution(A));
    }

    private static int solution(int[] a) {
        HashSet<Integer> naturalSet = new HashSet<>();
        int x = 1;
        if(a.length <= 0){
            return 1;
        }
        while(x<=a.length+1){
            naturalSet.add(x);
            x++;
        }
        Arrays.stream(a).forEach(i -> naturalSet.remove(i));
        return naturalSet.iterator().next();

    }
}
