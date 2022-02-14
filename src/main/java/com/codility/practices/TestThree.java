package com.codility.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestThree {
    public static void main(String[] args) {
        TestThree tth = new TestThree();
        /* Create Palindrome Digits
         * 89378 == 898
         * 54321 = 5
         */
        String input = "8930798";
        System.out.println("Input : "+input+"Output : "+tth.solution(input));
    }

    private String solution(String S) {
        String output = null;
        HashSet<Integer> uniqueDigits = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(char c : S.toCharArray()){
           Integer charVal = Integer.parseInt(String.valueOf(c));
           uniqueDigits.add(charVal);
           list.add(charVal);
        }
        if(uniqueDigits.size() == 1){
            for(Integer out : uniqueDigits){
                output =  uniqueDigits.iterator().next().toString();
            }
        }else if(uniqueDigits.size() == S.length()){
            List<Integer> sortedList = new ArrayList<>(uniqueDigits);
            Collections.sort(sortedList);
            output = sortedList.get(0).toString();
        }else if(uniqueDigits.size() < S.length()){
            String out = "";
            for(Integer distinctVals : uniqueDigits){
                list.remove(distinctVals);
            }
            if(list.contains(0)){
                list.removeAll(Collections.singleton(0));
            };
            Collections.sort(list, Collections.reverseOrder());
            for(int dup : list){
                uniqueDigits.remove(dup);
                out+=dup;
            }
            List<Integer> sortedList = new ArrayList<>(uniqueDigits);
            Collections.sort(sortedList,Collections.reverseOrder());
            StringBuilder units = new StringBuilder();
            units.append(out).reverse();
            out+=sortedList.get(0);
            out+=units;
            output = out;
        }

        return output.equals(null)?"0":output;
    }
}
