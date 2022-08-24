package com.codility.practices.after;

import java.util.Objects;

public class BinaryGap {

    public static void main(String[] args) {
        int inputNum = 1041;
        System.out.println("Binary Gap of "+inputNum+" is : "+solution(inputNum));
    }
    public static int solution(int n){
        String binaryString = Integer.toString(n,2);
        System.out.println(binaryString);
        boolean started = false;
        int counter = 0;
        int maxCount = 0;
        for (char c:binaryString.toCharArray()){
            if(Objects.equals(c,'1')){
                if(started && counter>maxCount){
                    maxCount = counter;
                }
                counter = 0;
                started = true;
            }else{
                counter++;
            }
        }
    return maxCount;
    }

}
