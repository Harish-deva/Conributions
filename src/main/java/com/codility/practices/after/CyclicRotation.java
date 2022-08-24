package com.codility.practices.after;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] input = {3, 8, 9, 7, 6};
        int noOfTimes = 3;
        for(int i : solution(input,noOfTimes)){
            System.out.println(i);
        }
    }

    public static int[] solution(int[] inputArr, int k){
        int arrayLen = inputArr.length;
        if(arrayLen < 2){
        }else if(k%arrayLen == 0){
        }else{
            for (int i = 0;i<k;i++) {
                int newFirstVal = inputArr[arrayLen - 1];
                for (int j = arrayLen - 2; j >= 0; j--) {
                    inputArr[j + 1] = inputArr[j];
                }
                inputArr[0] = newFirstVal;
            }
        }
        return inputArr;
    }
}
