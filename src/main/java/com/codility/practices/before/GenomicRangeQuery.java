package com.codility.practices.before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenomicRangeQuery {

    public static Map<Character,Integer> genomicValues = new HashMap<>();
    public static void main(String[] args) {
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        System.out.println("Genomic Range is : "+solution(S,P,Q));
    }

    private static List<Integer> solution(String s, int[] p, int[] q) {
    List<Integer> rangeList = new ArrayList<>();
    List<Integer> finalValues = new ArrayList<>();
        if(isPrerequisitesValidated(s,p,q)){
            initiateGenomicValues();
            char[] genomicChars = s.toCharArray();
            rangeList = IntStream.range(0, genomicChars.length)
                    .mapToObj(i -> genomicValues.get(genomicChars[i])).collect(Collectors.toList());
            for(int index=0;index<p.length;index++) {
                int beginIndex = p[index];
                int endIndex = q[index];
                int minValue =  rangeList.get(beginIndex);
                for (int j = beginIndex;j<endIndex;j++){
                    minValue = minValue <= rangeList.get(j) ? minValue:rangeList.get(j);
                }
                finalValues.add(minValue);
            }
        }else{
            System.out.println("Given Input Values are incorrect ");
            return rangeList;
        }

    return finalValues;
    }

    private static boolean isPrerequisitesValidated(String s, int[] p, int[] q) {
       return s.length() > 0 && p.length > 0 && p.length == q.length;
    }

    private static void initiateGenomicValues(){
        genomicValues.put('A',1);
        genomicValues.put('C',2);
        genomicValues.put('G',3);
        genomicValues.put('T',4);
    }
}
