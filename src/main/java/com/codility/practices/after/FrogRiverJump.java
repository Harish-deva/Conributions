package com.codility.practices.after;

import java.util.HashSet;

public class FrogRiverJump {
    public static int solution(int x, int[] A) {
        HashSet hs = new HashSet<>();
        for(int i = 1; i<=x; i++) {
            hs.add(i);
        }
        for(int i=0; i<A.length; i++){
            if(hs.remove(A[i])){
                if(hs.isEmpty()){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {1,3,1,2,3,5,7};
        int riverWidth = 5;
        System.out.println("Output : "+solution(riverWidth,input));
    }
}
