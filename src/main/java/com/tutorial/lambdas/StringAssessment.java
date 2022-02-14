package com.tutorial.lambdas;

import java.util.function.Predicate;

public class StringAssessment {

    public static boolean isBig(int num){
        Predicate<Integer> isNumBig = m -> m > 100;
        return isNumBig.test(num);
    }



}
