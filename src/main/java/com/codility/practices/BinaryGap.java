package com.codility.practices;

import java.util.concurrent.atomic.AtomicInteger;

public class BinaryGap {

    /*
     * 9 as Binary no. = 1001 ==> Binary Gap = 2
     * Similarly - 1000 or 1111 ==> Binary Gap = 0
     * 100001001 ==> Binary Gap = 4 (4>2?4:2)
     */

    public static void main(String[] args) {
        int n = 529;
        System.out.println("Binary Gap of "+n+" is "+binaryGap(n));
    }

    public static int binaryGap(int n){
        String binaryNum = Integer.toBinaryString(n);
        int binaryGap = 0;
        AtomicInteger counter = new AtomicInteger(0);
        boolean continueCount = false;
        for(char c : binaryNum.toCharArray()){
            if(c == '1' && !continueCount ){
                continueCount = true;
            }else if(c == '0' && continueCount){
                counter.getAndIncrement();
            }else if(c == '1' && continueCount){
                continueCount = false;
                binaryGap = binaryGap < counter.intValue()?counter.intValue():binaryGap;
            }
        }
        return binaryGap;
    }
}


