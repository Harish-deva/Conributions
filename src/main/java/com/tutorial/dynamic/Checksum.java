package com.tutorial.dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Checksum {

    private static boolean isSummable;
    private static Map<String,Boolean> cached_values = new HashMap();

    public static void main(String[] args) {
        System.out.println("Verification if sum of any natural numbers in array array {-1,0,2,3,5} equals 7 is in progress ----");
        Integer[] source_numbers = {-1,0,1,6};
        List<Integer> numbers = Arrays.asList(source_numbers).stream()
                .filter(value -> value > 0)
                .collect(Collectors.toList());
        System.out.println("Verification complete :: "+verifySum(7,numbers));
    }

    public static boolean verifySum(int target_sum, List<Integer> numbers){
        //System.out.println(target_sum+":"+numbers);
        if(isSummable) return true;
        //System.out.println(isSummable);
        if(numbers.size() == 0 || target_sum < 0 );
        else if(cached_values.containsKey(String.valueOf(target_sum+":"+numbers))) return cached_values.getOrDefault(String.valueOf(target_sum+":"+numbers),isSummable);
        else{
            for(Integer num : numbers) {
               int reminder = target_sum - num;
               if(reminder < 0);
               else if(reminder == 0) isSummable = true;
               else
                System.out.println("Numbers are "+target_sum+"& num is "+num+"; Therefore reminder = "+reminder);
                cached_values.putIfAbsent(String.valueOf(target_sum+":"+numbers),verifySum(reminder,numbers));
            }
        }
        return isSummable;
    }

}
