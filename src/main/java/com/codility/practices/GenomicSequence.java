package com.codility.practices;

import java.util.*;

public class GenomicSequence {
    /*Find Minimum Impact Factor
     * A=1;C=2;G=3;T=4 - Never changes
     * S = CAGCCTA, p =[0,5,0] ,Q =[2,5,6]
     * if k = 0 => p[k]=0 & q[k] = 2 => S.substr(0,2) = CAG => min = A(i.e) /1
     * if k = 1 => p[k]=5 & q[5] = 5 => S.substr(5,5) = T => min = T(i.e) / 4
     * Final expected result = [1,4,1]
     * */
    private Map<Character, Integer> genomicRepresentations = new HashMap<>();

    public static void main(String[] args) {

        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        GenomicSequence gs = new GenomicSequence();
        System.out.println("subs : "+S.substring(0,1));
        System.out.println("Inputs : S = "+S+" P = "+ Arrays.toString(P)+" Q = "+ Arrays.toString(Q)+". Gives Output : "+Arrays.toString(gs.solve(S,P,Q)));
    }

    private int[] solve(String s, int[] p, int[] q) {
        genomicRepresentations.put('A',1);
        genomicRepresentations.put('C',2);
        genomicRepresentations.put('G',3);
        genomicRepresentations.put('T',4);
        List<Integer> intStreamOfS = new ArrayList<>();
        for (char i : s.toCharArray()){
            intStreamOfS.add(genomicRepresentations.get(i));
        }
        ArrayList<Integer> outputArr = new ArrayList<Integer>();
        for(int k=0;k<p.length ;k++){
           int beginIndex =  p[k];
           int endIndex = q[k];
           int minVal= intStreamOfS.get(beginIndex);
           for(int l=beginIndex+1;l<=endIndex;l++){
               minVal= intStreamOfS.get(l)<minVal?intStreamOfS.get(l):minVal;
           }
            outputArr.add(minVal);
        }


        return outputArr.stream().mapToInt(Integer::intValue).toArray();
    }

}
