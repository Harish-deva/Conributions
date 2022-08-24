package com.neet.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductOfArrayExceptItself {
    /*
    input [1,2,3,4]
    output [2*3*4,1*3*4,1*2*4,1*2*3] = [24,12,8.6]
     */

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4};
        List<Integer> input = IntStream.of(inputArray).boxed().collect(Collectors.toList());
        calibrate(input).stream().forEach(x ->
                System.out.println("Output Array : "+x));
    }

    private static List<Integer> calibrate(List<Integer> input){

        int arrayLen = input.size();
        List<Integer> output = new ArrayList<>();
        int leftProduct = 1;
        for(int i = 0;i<arrayLen;i++){
            leftProduct = (i == 0)?leftProduct:leftProduct*input.get(i-1);
           // System.out.println(leftProduct);
            output.add(leftProduct);
        }
        int rightProduct = 1;
        for(int i=arrayLen-1;i>=0;i--){
            rightProduct = (i == arrayLen-1)?rightProduct:rightProduct*input.get(i+1);
            output.set(i,output.get(i)*rightProduct);
        }

        return output;
    }

}
