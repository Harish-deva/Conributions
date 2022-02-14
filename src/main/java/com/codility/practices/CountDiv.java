package com.codility.practices;

public class CountDiv {

    /* params int a,b,k
     * for (a <= i <= b)
     * return total no. of i's such that i%k == 0
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int k = 2;
        System.out.println("input a,b,k :"+a+","+b+","+k+" output : "+countDiv(a,b,k));
        //System.out.println();
    }

    private static int countDiv(int a, int b, int k) {
       if(a==b && a!=0){
           return a/k;
       }
       if(b>a){
           return (b/k)-((a-1)/k);
       }
       return 0;
    }

}
