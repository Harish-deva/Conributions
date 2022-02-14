package com.tutorial.lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperation {

    public static int square(int a){
        UnaryOperator<Integer> square = m -> m * m;
        return  square.apply(a);
    }



}
