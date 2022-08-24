package com.codility.practices.before;

/*You are given N counters, initially set to 0, and you have two possible operations on them:
• increase(X) - counter X is increased by 1,
• max counter - all counters are set to the maximum value of any counter.

A non-empty array A of M integers is given. This array represents consecutive operations:
• if A[K] = X, such that 1 <= X <= N, then operation K is increase(X)
• if A[K] = N + 1 then operation K is max counter.

For example, given integer N = 5 and array A such that:
A[0] = 3
A[1] = 4
A[2] = 4
A[3] = 6
A[4] = 1
A[5] = 4
A[6] = 4
the values of the counters after each consecutive operation will be:
(0, 0, 1, 0, 0)
(0, 0, 1, 1, 0)
(0, 0, 1, 2, 0)
(2, 2, 2, 2, 2)
(3, 2, 2, 2, 2)
(3, 2, 2, 3, 2)
(3, 2, 2, 4, 2)

 */

import java.util.LinkedList;
import java.util.List;

public class MaxCounters {

    public static List<Integer> list = new LinkedList<Integer>();
    public static int maxVal;

    public static void main(String[] args) {
        int[] input = {3,4,4,6,1,4,4};
        int N = 5;
        System.out.println("Output MaxCounters "+solution(N,input));
    }

    private static List<Integer> solution(int N, int[] input) {

        createList(N,0);

        for (int  j=0;j<input.length;j++){
            int index = input[j]-1;
            System.out.println("list : "+list);
            if(input[j] == N+1){
                System.out.println("max list : "+list);
                maxVal = list.stream().max(Integer::compare).get();
                System.out.println("Max Value : "+maxVal);
                createList(N,maxVal);
            }else if(index >=1 || index <= N){
                list.set(index,list.get(index)+1);
            }
        }
        return list;
    }

    private static void createList(int n, int defaultValue) {
        for (int i=0;i<n;i++){
            if(defaultValue > 0){
                list.set(i,defaultValue);
            }else{
                list.add(defaultValue);
            }
        }
    }

}
