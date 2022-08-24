package com.neet.practices;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {1,3,4,5,7,11};
        int target = 9;
        System.out.print("Input numbers "+numbers.length+" & target "+target+" gives output "+ Arrays.toString(twoSum(numbers,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        List<Integer> twoSumList = IntStream.of(numbers).boxed().collect(Collectors.toList());
        AtomicInteger index = new AtomicInteger(1);
        for(Integer i : twoSumList){
            int reminder = target - i;
            if(twoSumList.contains(reminder)){
                int beginIndex = index.intValue();
                int finalIndex = beginIndex;
                while(twoSumList.get(finalIndex) <= reminder){
                    finalIndex ++;
                }
                int[] sol = {beginIndex,finalIndex};
                return sol;
            }
            index.incrementAndGet();
        }
        return new int[0];
    }
}
