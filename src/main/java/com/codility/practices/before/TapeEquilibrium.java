package com.codility.practices.before;
/*
A represents no.s on a Tape
N is the no. of integers on tape {2 .. 100000}
P => 0 < P < N
Diff : (A[0]+A[1]..A[P-1])- (A[P]+A[P+1]..A[N-1])
eg. Tape A = {3,1,2,4,3}
if P = 1 , Diff = 3 - (1+2+3+4) = 7
*/
public class TapeEquilibrium {
    public static void main(String[] args) {
       int[] tape = {3,1,2,4,3} ;
       System.out.println("Given tape {3,1,2,4,3} has the min diff "+diff(tape));
    }
    public static int diff(int[] A){
        int arrayLen = A.length;
        int beginArraySum = 0;
        int endArraySum = 0;
        int minVal = 0;
        for (int p = 1; p<arrayLen-1;p++) {
            for (int i = 0; i < arrayLen; i++) {
                if (i < p) {
                    beginArraySum += A[i];
                } else {
                    endArraySum += A[i];
                }
            }
            int diff = Math.abs(beginArraySum-endArraySum);
            minVal = minVal == 0? diff:minVal<diff?minVal:diff;
            beginArraySum = 0;
            endArraySum = 0;
        }
        return Math.abs(beginArraySum-endArraySum);
    }
}
