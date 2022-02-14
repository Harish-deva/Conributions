package com.codility.practices;

import java.util.Arrays;

public class ArrayRotation {
    /*Description
    * Input int[] A, int K
    * Rotation = 1st Val -> 2nd Val, 2nd Val -> 3rd Val
    * finally last value -> 1st Value
    * eg. [1,4,6,3] => [3,1,4,6]
    * K = no. of rotations
    * eg. if K = 2,  [1,4,6,3]  => [3,1,4,6] && [3,1,4,6] => [6,3,1,4]
    */

    public static void main(String[] args) {
        System.out.println("Passing Array [1,4,6,3] with 2 rotations" );
        int[] A = {4,5,6,7};
        int K = 4;
        solution(A,K);
    }

    public static int[] solution(int[] A, int K){
        int[] B = new int[A.length];;
        for (int i=0;i<K;i++){
            int lastVal = A[A.length-1];
            for(int j=0;j<=A.length-2;j++){
                //System.out.println("A :: "+A[j]);
                B[j+1]=A[j];
            }
            B[0]=lastVal;

            if(i<K-1){
                A = B;
                B = new int[A.length];
            }

        }
        System.out.println("Output :: "+ Arrays.toString(B));
        return B;
    }

}
