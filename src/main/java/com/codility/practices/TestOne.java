package com.codility.practices;

public class TestOne {
    public static void main(String[] args) {
        TestOne to = new TestOne();
        int n = 5;
        /*    L
         *    L
         *    L
         *    LLLL
         */
        System.out.println("Input : "+n+"Output : ");
        to.solution(n);
    }

    private void solution(int N) {
        StringBuilder sb = new StringBuilder("L");
        for (int i=0;i<N-1;i++){
            System.out.println("L");
            sb.append("L");
        }
        System.out.println(sb);
    }


}
