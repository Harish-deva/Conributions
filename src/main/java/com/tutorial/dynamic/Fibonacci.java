package com.tutorial.dynamic;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer,Integer> fibValmap = new HashMap();

    public static void main(String[] args) {
        System.out.println("Fib value of 10 is : "+fib(50));
    }

    private static int fib(int n){
        if(n <= 0){
            return 0;
        }else if (n <= 2){
            return 1;
        }else if (fibValmap.containsKey(n)){
            return fibValmap.get(n);
        }
        else{
            int sec_prev_val = fib(n-2);
            int prev_val = fib(n-1);
            int final_val = prev_val+sec_prev_val;
            fibValmap.put(n, final_val);
            return final_val;
        }
    }

}
